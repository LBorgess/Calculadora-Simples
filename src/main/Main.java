package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Borges
 */
public class Main {

    public static void main(String[] args) {
        int opContinuar = 0;
        double num1, num2, res;

        do {
            String v1 = JOptionPane.showInputDialog(null,
                    "Informe o 1o. valor",
                    "1o. valor", -1);

            num1 = Double.parseDouble(v1);

            String v2 = JOptionPane.showInputDialog(null,
                    "Informe o 2o. valor",
                    "2o. valor", -1);

            num2 = Double.parseDouble(v2);

            String operacao = JOptionPane.showInputDialog(null,
                    "Qual operação deseja realizar?\n"
                    + "[ 1 ] Adição\n"
                    + "[ 2 ] Subtração\n"
                    + "[ 3 ] Multiplicação\n"
                    + "[ 4 ] Divisão");

            int conta = Integer.parseInt(operacao);

            switch (conta) {
                case 1:
                    res = num1 + num2;
                    JOptionPane.showMessageDialog(null,
                            String.format("%.2f + %.2f = %.2f", num1, num2, res),
                            "Resultado da Adição", -1);
                    break;
                case 2:
                    res = num1 - num2;
                    JOptionPane.showMessageDialog(null,
                            String.format("%.2f - %.2f = %.2f", num1, num2, res),
                            "Resultado da Subtração", -1);
                    break;
                case 3:
                    res = num1 * num2;
                    JOptionPane.showMessageDialog(null,
                            String.format("%.2f x %.2f = %.2f", num1, num2, res),
                            "Resultado da Multiplicação", -1);
                    break;
                case 4:
                    res = num1 / num2;
                    JOptionPane.showMessageDialog(null,
                            String.format("%.2f / %.2f = %.2f", num1, num2, res),
                            "Resultado da Divisão", -1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

            String novaconta = JOptionPane.showInputDialog(null,
                    "Deseja realizar uma nova operação?\n[ 1 ] Sim\n[ 0 ] Não");

            opContinuar = Integer.parseInt(novaconta);

        } while (opContinuar != 0);
    }
}
