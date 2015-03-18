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
        bitString = btSt.toCharArray();
        addToString();
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

}
