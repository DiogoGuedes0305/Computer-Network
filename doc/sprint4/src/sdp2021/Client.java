package sdp2021;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;

import static sdp2021.SDP.Code.*;

public class Client implements SDP {

	private final Socket socket;

	@Override
	public Socket getSocket() {
		return socket;
	}

	public Client(InetAddress host, int port) throws IOException {
		socket = new Socket(host, port);
		testa();
	}

	public Client(String host, int port) throws IOException {
		socket = new Socket(host, port);
		testa();
	}

	private void testa() throws IOException {
		enviaMensagem(TESTE);
		Mensagem mensagem = new Mensagem(this);
		if (mensagem.code != ENTENDIDO) {
			fechaLigacao();
			throw new IOException("não foi possível comunicar com o servidor");
		}
	}

	public void sendFile(String fileName, String destFileName) throws IOException {
		//
		System.out.println("envio do nome do ficheiro");
		enviaMensagem(NOME_FICHEIRO, destFileName.getBytes());
		Mensagem mensagem = new Mensagem(this);
		if (mensagem.code != ENTENDIDO) {
			fechaLigacao();
			throw new IOException("não foi possível enviar nome do ficheiro");
		}

		//
		File file;
		byte[] buffer;
		try {
			file = new File(fileName);
			System.out.println("enviar ficheiro");
			buffer = Files.readAllBytes(file.toPath());
		} catch (IOException ex) {
			fechaLigacao();
			throw ex;
		}

		int n_segmentos = buffer.length / max_bytes;
		for (int i = 0; i < n_segmentos; i++) {
			byte[] segmento_buffer = new byte[max_bytes];
			System.arraycopy(buffer, i * 255, segmento_buffer, 0, max_bytes);
			System.out.println("enviar segmento");
			enviaMensagem(SEGMENTO, segmento_buffer);
			mensagem = new Mensagem(this);
			if (mensagem.code != ENTENDIDO) {
				fechaLigacao();
				throw new IOException("não foi possível enviar o " + (i + 1) + "o segmento");
			}
		}
		System.out.println("enviar fim de ficheiro");
		int sobra = buffer.length - n_segmentos * max_bytes;
		byte[] fim_buffer = new byte[sobra];
		System.arraycopy(buffer, n_segmentos * 255, fim_buffer, 0, sobra);
		enviaMensagem(FIM_FICHEIRO, fim_buffer);
		mensagem = new Mensagem(this);
		if (mensagem.code != ENTENDIDO) {
			fechaLigacao();
			throw new IOException("não foi possível enviar o fim do ficheiro");
		}
	}

	public void fechaLigacao() throws IOException {
		System.out.println("fechar ligação");
		enviaMensagem(FIM);
		Mensagem mensagem = new Mensagem(this);
		if (mensagem.code != ENTENDIDO) {
			socket.close();
			throw new IOException("não foi possível fechar a ligação do lado do servidor");
		}
		socket.close();
	}

}
