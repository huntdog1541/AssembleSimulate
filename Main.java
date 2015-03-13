/**
 * Created by David on 3/7/2015.
 */
public class Main {

    public Main()
    {

    }

    public static void main(String args[])
    {
        Display dsp = new Display();
        System.out.println("Hello World");
        Register reg = new Register(44);
        reg.updateNumber(16);
    }
}
