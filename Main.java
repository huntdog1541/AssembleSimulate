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

        System.out.println("Hello World");
        Register reg = new Register(44);
        reg.addToString();
        JFrame frame = new JFrame ("Assemble Simulator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI());
        frame.pack();
        frame.setVisible (true);
        CodeContent cc = new CodeContent();
    }
}
