import javax.swing.*;

/**
 * Created by David on 3/7/2015.
 */
public class Main {

    public Main()
    {

    }

    public static void main(String args[])
    {
        VM virt = new VM();
        Register reg = new Register(34);
        System.out.println("The hex for number 32 is " + reg.convertToHex(32));
        JFrame frame = new JFrame ("Assemble Simulator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI(virt));
        frame.pack();
        frame.setVisible (true);
        virt.getCode();
    }
}
