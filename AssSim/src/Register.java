/**
 * Created by David on 3/7/2015.
 */
public class Register {

    private int value;
    private char[] bit32;
    private char[] bit64;
    private String bitString32;
    private String bitString64;
    private int valueSize;
    private String regName;

    public Register()
    {
        value = 0;
        bitString64 = Integer.toBinaryString(value);
        bit32 = new char[32];
        bit64 = new char[64];
        bit64 = bitString64.toCharArray();
        valueSize = 64;
        addToString();
    }

    public Register(String name)
    {
        regName = name;
        value = 0;
        bitString64 = Integer.toBinaryString(value);
        bit32 = new char[32];
        bit64 = new char[64];
        bit64 = bitString64.toCharArray();
        valueSize = 64;
        addToString();
    }

    public Register(int num)
    {
        value = num;
        bitString64 = Integer.toBinaryString(value);
        bit32 = new char[32];
        bit64 = new char[64];
        bit64 = bitString64.toCharArray();
        valueSize = 64;
        addToString();
        getIntFromByte();
    }

    public Register(String name, int num)
    {
        regName = name;
        value = num;
        bitString64 = Integer.toBinaryString(value);
        bit32 = new char[32];
        bit64 = new char[64];
        bit64 = bitString64.toCharArray();
        valueSize = 64;
        addToString();
    }

    public void addToString()
    {
        char[] tempString = new char[64];
        int i;
        int j = valueSize-1;
        for(i = bit64.length-1; i >= 0; i--)
        {
            tempString[j] = bit64[i];
            j--;
        }
        for(i = j; i >= 0; i-- )
        {
            tempString[i] = '0';
        }
        convertToString(tempString);
        System.out.println("The string is " + bitString64);
        updateByteArray();
    }
    
    public void convertToString(char[] arry)
    {
    	StringBuilder sb = new StringBuilder();
    	for(char temp : arry)
    	{
    		sb.append(temp);
    	}
    	bitString64 = sb.toString();
    }

    public void updateNumber(int number)
    {
    	value = number;
        bitString64 = Integer.toBinaryString(value);
        bit64 = new char[64];
        bit64 = bitString64.toCharArray();
        addToString();
    }
    
    public void update()
    {
    	bitString64 = Integer.toBinaryString(value);
        bit64 = new char[64];
        addToString();
        updateByteArray();
    }

    public void getIntFromByte()
    {
        int i, temp = 1, ans = 0;
        for(i = (bit64.length - 1); i > 0 ; i--)
        {
            if(bit64[i] == '1')
                ans = ans + temp;
            temp = temp * 2;
        }
        System.out.println("The value of int from byte: " + ans);
    }

    public void updateByteArray()
    {
        int i = 0;
        bit64 = new char[bitString64.length()];
        clearArray();
        for(i = (bit64.length - 1); i > 0; i--)
        {
            bit64[i] = bitString64.charAt(i);
        }
    }
    
    public void clearArray()
    {
    	int i;
    	for(i = 0; i < bit64.length; i++)
    	{
    		bit64[i] = '0';
    	}
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValueSize() {
		return valueSize;
	}

	public void setValueSize(int valueSize) {
		this.valueSize = valueSize;
	}    

    public boolean compareString(String temp)
    {
        boolean ans = false;
        if(regName.equals(temp))
            ans = true;
        return ans;
    }

    public String getBitString32() {
        return bitString32;
    }

    public void setBitString32(String bitString32) {
        this.bitString32 = bitString32;
    }

    public String getBitString64() {
        return bitString64;
    }

    public void setBitString64(String bitString64) {
        this.bitString64 = bitString64;
    }
}
