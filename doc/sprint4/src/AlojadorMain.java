import Alojador.Alojador;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class AlojadorMain {
	public static void main(String[] args) throws IOException {
		System.out.println(InetAddress.getLocalHost().getHostAddress().trim());
		System.out.print("insira o IP do Centro de distribuição: ");
		Scanner scanner = new Scanner(System.in);
		String ipCD = scanner.next();
		System.out.print("insira o IP com que registar o alojador: ");
		String ipAl = scanner.next();
		new Alojador(ipCD, ipAl);
	}
}
