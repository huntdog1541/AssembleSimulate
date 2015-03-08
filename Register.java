/**
 * Created by David on 3/7/2015.
 */
public class Register {

    private int value;
    private char[] bitString;
    private String btSt;
    private int valueSize;

    public Register()
    {
        value = 0;
        btSt = Integer.toBinaryString(value);
        bitString = new char[64];
        bitString = btSt.toCharArray();
        valueSize = 64;
    }

    public Register(int num)
    {
        value = num;
        btSt = Integer.toBinaryString(value);
        bitString = new char[64];
        bitString = btSt.toCharArray();
        valueSize = 64;
    }

    public void printStoreValue()
    {
        System.out.println("The stored number is " + value + " as " + btSt + "\n");
        System.out.println("The count is " + Integer.bitCount(value));
        System.out.println("The Trailing zeros is " + Integer.numberOfTrailingZeros(value));
        System.out.println("The Leading zeros is " + Integer.numberOfLeadingZeros(value));
        for(char temp2 : bitString)
        {
            System.out.print(temp2 + "  ");
        }
    }

    public void addToString()
    {
        char[] tempString = new char[32];
        int i;
        for(i = bitString.length; i > 0; i--)
        {
            tempString[i] = bitString[i];
        }
        for(i = (bitString.length-i); i > 0; i-- )
        {
            tempString[i] = 0;
        }
        System.out.println("The binary strin is " + tempString);
    }


}
