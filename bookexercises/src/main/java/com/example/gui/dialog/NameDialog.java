package com.example.gui.dialog;

import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, String.format("Hello, %s, welcome to Java!", name));
    }
}
