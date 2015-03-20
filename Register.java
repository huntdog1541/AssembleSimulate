/**
 * Created by David on 3/7/2015.
 */
public class Register {

    private int value;
    private char[] bitString;
    private String btSt;
    private int valueSize;
    private String regName;

    public Register()
    {
        value = 0;
        btSt = Integer.toBinaryString(value);
        bitString = new char[32];
        bitString = btSt.toCharArray();
        valueSize = 32;
        addToString();
    }

    public Register(String name)
    {
        regName = name;
        value = 0;
        btSt = Integer.toBinaryString(value);
        bitString = new char[32];
        bitString = btSt.toCharArray();
        valueSize = 32;
        addToString();
    }

    public Register(int num)
    {
        value = num;
        btSt = Integer.toBinaryString(value);
        bitString = new char[32];
        bitString = btSt.toCharArray();
        valueSize = 32;
        addToString();
        getIntFromByte();
    }

    public Register(String name, int num)
    {
        regName = name;
        value = num;
        btSt = Integer.toBinaryString(value);
        bitString = new char[32];
        bitString = btSt.toCharArray();
        valueSize = 32;
        addToString();
    }

    public void addToString()
    {
        char[] tempString = new char[32];
        int i;
        int j = valueSize-1;
        for(i = bitString.length-1; i >= 0; i--)
        {
            tempString[j] = bitString[i];
            j--;
        }
        for(i = j; i >= 0; i-- )
        {
            tempString[i] = '0';
        }
        convertToString(tempString);
        System.out.println("The string is " + btSt);
        updateByteArray();
    }
    
    public void convertToString(char[] arry)
    {
    	StringBuilder sb = new StringBuilder();
    	for(char temp : arry)
    	{
    		sb.append(temp);
    	}
    	btSt = sb.toString();
    }

    public void updateNumber(int number)
    {
    	value = number;
        btSt = Integer.toBinaryString(value);
        bitString = new char[32];
        bitString = btSt.toCharArray();
        addToString();
    }
    
    public void update()
    {
    	btSt = Integer.toBinaryString(value);
        bitString = new char[32];
        addToString();
        updateByteArray();
    }

    public void getIntFromByte()
    {
        int i, temp = 1, ans = 0;
        for(i = (bitString.length - 1); i > 0 ; i--)
        {
            if(bitString[i] == '1')
                ans = ans + temp;
            temp = temp * 2;
        }
        System.out.println("The value of int from byte: " + ans);
    }

    public void updateByteArray()
    {
        int i = 0;
        bitString = new char[btSt.length()];
        clearArray();
        for(i = (bitString.length - 1); i > 0; i--)
        {
            bitString[i] = btSt.charAt(i);
        }
    }
    
    public void clearArray()
    {
    	int i;
    	for(i = 0; i < bitString.length; i++)
    	{
    		bitString[i] = 0;
    	}
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getBtSt() {
		return btSt;
	}

	public void setBtSt(String btSt) {
		this.btSt = btSt;
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
}
