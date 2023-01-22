package Alojador;

import sdp2021.*;

import java.io.IOException;

public class Alojador {

	public Alojador(String ipCentroDistro, String ipAlojador) throws IOException {
		Client alojadorClient = new Client(ipCentroDistro, Server.port);
		// enviar disponibilidade ao Centro de distribuição
		byte[] IP = ipAlojador.trim().getBytes();
		alojadorClient.enviaMensagem(SDP.Code.DISPONIVEL, IP);
		Mensagem mensagem = new Mensagem(alojadorClient);
		if (mensagem.code != SDP.Code.ENTENDIDO) {
			alojadorClient.fechaLigacao();
			throw new IOException("não foi possível informar disponibilidade ao centro de distribuição");
		}
		alojadorClient.fechaLigacao();
		System.out.println("disponibilidade de alojador foi informada ao centro de distribuição");

		// iniciar receção de ficheiros
		Server.getInstance().start();
	}

}
