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
        Register reg = new Register(57);
        JFrame frame = new JFrame ("Assemble Simulator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI(virt));
        frame.pack();
        frame.setVisible (true);
        virt.getCode();
    }
}