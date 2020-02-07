
package paralelograma;

import javax.swing.JOptionPane;

public class Paralelograma {

    public static void main(String[] args) {
        
        int B = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a maior base do Paralelograma"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a menor base do Paralelograma"));
        int h = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a altura do Paralelograma"));
        
        int s = ((B + b)* h) / 2;
        
        JOptionPane.showMessageDialog(null,"O valor do paralelograma é: " + s);
        
    }
    
}
