package swing1;

import javax.swing.JOptionPane;

public class Swing1 {

    public static void main(String[] args) {
        
        String fn = JOptionPane.showInputDialog("Enter first number Mike: ");
        String sn = JOptionPane.showInputDialog("Enter second number Mike: ");
        
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "Mike the answer is " +sum, "Mike's title", JOptionPane.PLAIN_MESSAGE);
        // Takes 5 perameters: 1:Position on screen=centre is null. 2:Message on box, 3:Maths. 4:The title bar. 5:Message to pop up.
    }
     
}
