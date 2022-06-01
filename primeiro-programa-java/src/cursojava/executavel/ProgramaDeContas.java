package cursojava.executavel;

import javax.swing.JOptionPane;

public class ProgramaDeContas {

	public static void main(String[] args) {

		boolean fimDoJogo = false;

		while (!fimDoJogo) {
			String op = JOptionPane.showInputDialog(
					"Selecione uma opção: \n(1)--- Soma.\n(2)--- Subtração.\n(3)--- Divisão.\n(4)--- Multiplicação.\n(5)--- Média.");

			Integer op1 = Integer.parseInt(op);

			if (op1 < 1 || op1 > 5) {
				JOptionPane.showMessageDialog(null, "Opção Inválida, tente novamente...");
			} else if (op1 == 1) {
				JOptionPane.showMessageDialog(null, "Opção de SOMA escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro número");
				String n2 = JOptionPane.showInputDialog("Segundo número");
				String n3 = JOptionPane.showInputDialog("Terceiro número");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);
				Integer n31 = Integer.parseInt(n3);

				Integer soma = (n11 + n21 + n31);

				JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
				fimDoJogo = validateContinue();
			} else if (op1 == 2) {
				JOptionPane.showMessageDialog(null, "Opção de SUBTRAÇÃO escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro número");
				String n2 = JOptionPane.showInputDialog("Segundo número");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);

				Integer sub = (n11 - n21);

				JOptionPane.showMessageDialog(null, "O resultado da soma é: " + sub);
				fimDoJogo = validateContinue();
			} else if (op1 == 3) {
				JOptionPane.showMessageDialog(null, "Opção de DIVISÃO escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro número");
				String n2 = JOptionPane.showInputDialog("Segundo número");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);

				Integer div = (n11 / n21);
				Integer resto = (n11 % n21);

				JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + div);

				Integer verifdiv = JOptionPane.showConfirmDialog(null, "Deseja verificar o resto da Divisão?");
				if (verifdiv == 0) {
					JOptionPane.showMessageDialog(null, "O resto da Divisão é: " + resto);
					fimDoJogo = validateContinue();
				} else {
					fimDoJogo = validateContinue();
				}

			} else if (op1 == 4) {
				JOptionPane.showMessageDialog(null, "Opção de Multiplicação escolhida");

				String n1 = JOptionPane.showInputDialog("Primeiro número:");
				String n2 = JOptionPane.showInputDialog("Segundo número:");
				String n3 = JOptionPane.showInputDialog("Terceiro número:");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);
				Integer n31 = Integer.parseInt(n3);

				Integer mult = (n11 * n21 * n31);

				JOptionPane.showMessageDialog(null, "O resultado da MULTIPLICAÇÃO é: " + mult);
				fimDoJogo = validateContinue();
			} else if (op1 == 5) {
				JOptionPane.showMessageDialog(null, "Opção de Média escolhida");

				String n1 = JOptionPane.showInputDialog("Primeira nota:");
				String n2 = JOptionPane.showInputDialog("Segunda nota:");
				String n3 = JOptionPane.showInputDialog("Terceira nota:");
				Integer n11 = Integer.parseInt(n1);
				Integer n21 = Integer.parseInt(n2);
				Integer n31 = Integer.parseInt(n3);

				Integer media = (n11 + n21 + n31) / 3;

				if (media >= 7) {
					JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
					fimDoJogo = validateContinue();
				} else if (media >= 4 && media <= 6.9) {
					JOptionPane.showMessageDialog(null, "Recuperação com média: " + media);
					fimDoJogo = validateContinue();
				} else {
					JOptionPane.showMessageDialog(null, "Reprovado com média: " + media);
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