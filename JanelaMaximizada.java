
package janelamaximizada;

import javax.swing.*;
import  java.awt.*;

public class JanelaMaximizada extends JFrame{

    public JanelaMaximizada(){
        super("Como exibir a janela maximizada");// parte superior da tela
        ImageIcon icone = new ImageIcon("f.gif");
        setIconImage(icone.getImage());
        Container tela = getContentPane();//muda a cor da janela
        tela.setBackground(Color.blue); //coloca a cor como azul(blue)
        setSize(500, 300);//muda o tamanho da janela
        setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH); //deixa em tela maximizada
        //setExtendedState(ICONIFIED); //deixa da janela fora da tela 
        //setResizable(false); //não permite que mude o tamanho
        setLocationRelativeTo(null);//deixa a janela no centro da tela 
    }

    public static void main(String[] args) {
        
        JanelaMaximizada app = new JanelaMaximizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
