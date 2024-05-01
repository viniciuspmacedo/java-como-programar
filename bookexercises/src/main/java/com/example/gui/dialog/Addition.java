package com.example.gui.dialog;

import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String number2 = JOptionPane.showInputDialog("Digite o segundo número");

        double sum = Double.parseDouble(number1) + Double.parseDouble(number2);

        String result = String.format("%.2f + %.2f = %.2f", number1, number2, sum);

        JOptionPane.showMessageDialog(null, result);
    }
}
