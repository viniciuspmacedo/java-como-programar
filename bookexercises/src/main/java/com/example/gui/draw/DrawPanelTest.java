package com.example.gui.draw;

import javax.swing.JFrame;

//Criando JFrame para exibir um DrawPanel
public class DrawPanelTest {
    public static void main(String[] args) {
        //cria um painel que contem o desenho
        DrawPanel panel = new DrawPanel();

        //cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

       //configura o frame para ser encerrado quando ele é fechado
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       application.add(panel);
       application.setSize(250, 250);
       application.setVisible(true);
    }
}
