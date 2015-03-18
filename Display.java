import javax.swing.*;

/**
 * Created by David on 3/12/2015.
 */
public class Display {

    public Display()
    {
        JFrame frame = new JFrame ("GUI");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI());
        frame.pack();
        frame.setVisible (true);
    }
}
