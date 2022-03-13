import javax.swing.*;

public class CustomerProfile {
    public static void main(String[] args) {
        //Read from UID
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showConfirmDialog(null,"Hi," + name );



        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showConfirmDialog(null,"Your age is " + age +" God you're old..");





    }
}
