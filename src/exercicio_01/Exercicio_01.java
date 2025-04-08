package exercicio_01;

import javax.swing.JOptionPane;

public class Exercicio_01 {

    public static void main(String[] args) {
        double numero, metade;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número: "));
        if (numero > 10) {
            metade = numero / 2;
            JOptionPane.showMessageDialog(null, "A metade é: " + metade);
        } else {
            JOptionPane.showConfirmDialog(null, "Seu numero é: " + numero);
        }
    }
}