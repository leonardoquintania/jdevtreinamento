package cursojava.executavel;

import javax.swing.JOptionPane;

public class ProgramaDeContas {

	public static void main(String[] args) {

		boolean fimDoJogo = false;

		while (!fimDoJogo) {
			String op = JOptionPane.showInputDialog(
					"Selecione uma op��o: \n(1)--- Soma.\n(2)--- Subtra��o.\n(3)--- Divis�o.\n(4)--- Multiplica��o.\n(5)--- M�dia.");

			Integer op1 = Integer.parseInt(op);

			if (op1 < 1 || op1 > 5) {
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida, tente novamente...");
			} else if (op1 == 1) {
				JOptionPane.showMessageDialog(null, "Op��o de SOMA escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro n�mero");
				String n2 = JOptionPane.showInputDialog("Segundo n�mero");
				String n3 = JOptionPane.showInputDialog("Terceiro n�mero");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);
				Integer n31 = Integer.parseInt(n3);

				Integer soma = (n11 + n21 + n31);

				JOptionPane.showMessageDialog(null, "O resultado da soma �: " + soma);
				fimDoJogo = validateContinue();
			} else if (op1 == 2) {
				JOptionPane.showMessageDialog(null, "Op��o de SUBTRA��O escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro n�mero");
				String n2 = JOptionPane.showInputDialog("Segundo n�mero");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);

				Integer sub = (n11 - n21);

				JOptionPane.showMessageDialog(null, "O resultado da soma �: " + sub);
				fimDoJogo = validateContinue();
			} else if (op1 == 3) {
				JOptionPane.showMessageDialog(null, "Op��o de DIVIS�O escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro n�mero");
				String n2 = JOptionPane.showInputDialog("Segundo n�mero");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);

				Integer div = (n11 / n21);
				Integer resto = (n11 % n21);

				JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + div);

				Integer verifdiv = JOptionPane.showConfirmDialog(null, "Deseja verificar o resto da Divis�o?");
				if (verifdiv == 0) {
					JOptionPane.showMessageDialog(null, "O resto da Divis�o �: " + resto);
					fimDoJogo = validateContinue();
				} else {
					fimDoJogo = validateContinue();
				}

			} else if (op1 == 4) {
				JOptionPane.showMessageDialog(null, "Op��o de Multiplica��o escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro n�mero:");
				String n2 = JOptionPane.showInputDialog("Segundo n�mero:");
				String n3 = JOptionPane.showInputDialog("Terceiro n�mero:");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);
				Integer n31 = Integer.parseInt(n3);

				Integer mult = (n11 * n21 * n31);

				JOptionPane.showMessageDialog(null, "O resultado da MULTIPLICA��O �: " + mult);
				fimDoJogo = validateContinue();
			} else if (op1 == 5) {
				JOptionPane.showMessageDialog(null, "Op��o de M�dia escolhida");

				String n1 = JOptionPane.showInputDialog("Primeira nota:");
				String n2 = JOptionPane.showInputDialog("Segunda nota:");
				String n3 = JOptionPane.showInputDialog("Terceira nota:");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);
				Integer n31 = Integer.parseInt(n3);

				Integer media = (n11 + n21 + n31) / 3;

				if (media >= 7) {
					JOptionPane.showMessageDialog(null, "Aprovado com m�dia: " + media);
					fimDoJogo = validateContinue();
				} else if (media >= 4 && media <= 6.9) {
					JOptionPane.showMessageDialog(null, "Recupera��o com m�dia: " + media);
					fimDoJogo = validateContinue();
				} else {
					JOptionPane.showMessageDialog(null, "Reprovado com m�dia: " + media);
					fimDoJogo = validateContinue();
				}
			}
		}
	}

	private static boolean validateContinue() {
		String continuar = JOptionPane.showInputDialog("Deseja continuar? [S/N]");
		if (continuar.equalsIgnoreCase("N")) {
			JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
		}
		return continuar.equalsIgnoreCase("N");
	}
}