import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int horaInicial = scanner.nextInt();
		int minutoInicial = scanner.nextInt();
		int horaFinal = scanner.nextInt();
		int minutoFinal = scanner.nextInt();

		int instanteInicial = horaInicial * 60 + minutoInicial;
		int instanteFinal = horaFinal * 60 + minutoFinal;

		int duracao;
		if (instanteInicial < instanteFinal) {
			duracao = instanteFinal - instanteInicial;
		} else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}

		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;

		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

		scanner.close();
	}

}
