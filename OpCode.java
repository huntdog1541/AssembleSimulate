/**
 * Created by David on 3/7/2015.
 */
public class OpCode {

    public OpCode()
    {

    }

    public void executeCode(String opc, String[] restOfString, VM virt)
    {
         if(opc.equals("ADD"))
             add(restOfString, virt);
    }

    public void add(String[] rest, VM virt)
    {
        if(rest.length == 3)
        {
            Register store = virt.getRegister(rest[0]);
            Register source1 = virt.getRegister(rest[1]);
            Register source2 = virt.getRegister(rest[2]);
            store.setValue(source1.getValue() + source2.getValue());
        }
    }

    public void inc()
    {

    }

    public void ltrfunction(String[] rest, VM virt)
    {
        if(rest.length == 2)
        {
            Register store = virt.getRegister(rest[0]);
            int val = Integer.parseInt(rest[1]);
            store.setValue(val);
        }
    }

    public void ANDfunction(String[] rest, VM virt)
    {
        if(rest.length == 3)
        {
            Register store = virt.getRegister(rest[0]);
            Register source1 = virt.getRegister(rest[1]);
            Register source2 = virt.getRegister(rest[2]);
            char[] by1 = source1.getBtSt().toCharArray();
            char[] by2 = source2.getBtSt().toCharArray();
            char[] by3 = compareBytesAND(by1, by2);

        }
    }

    public char[] compareBytesAND(char[] by1, char[] by2)
    {
        int size = by1.length, i = 0;
        char[] ans = new char[by1.length];
        for(i = 0; i < size; i++)
        {
            if((by1[i]== '1' ) && (by2[i] == '1'))
                ans[i] = '1';
            else
                ans[i] = '0';
        }
        return ans;
    }

    public char[] compareBytesOR(char[] by1, char[]by2)
    {
        int size = by1.length, i = 0;
        char[] ans = new char[by1.length];
        for(i = 0; i < size; i++)
        {
            if((by1[i]== '1' ) || (by2[i] == '1'))
                ans[i] = '1';
            else
                ans[i] = '0';
        }
        return ans;
    }

    public char[] compareBytesNOT(char[] by1)
    {
        int size = by1.length, i = 0;
        char[] ans = new char[by1.length];
        for(i = 0; i < size; i++)
        {
            if((by1[i]== '1' ))
                ans[i] = '0';
            else
                ans[i] = '1';
        }
        return ans;
    }

    public char[] compareBytesXOR(char[] by1, char[]by2)
    {
        int size = by1.length, i = 0;
        char[] ans = new char[by1.length];
        for(i = 0; i < size; i++)
        {
            if((by1[i]== '1' ) && (by2[i] == '0'))
                ans[i] = '1';
            else if((by1[i] == '0') && (by2[i] == '1'))
                ans[i] = '1';
            else
                ans[i] = '0';
        }
        return ans;
    }
}
