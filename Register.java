/**
 * Created by David on 3/7/2015.
 */
public class Register {

    private long value;
    private char[] bitString;
    private int valueSize;

    public Register()
    {
        value = 0;
        bitString = new char[64];
        valueSize = 64;
    }

    public Register(int num)
    {
        value = num;
        bitString = new char[64];
        valueSize = 64;
    }



}
