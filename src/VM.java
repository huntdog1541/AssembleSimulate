import java.util.ArrayList;

/**
 * Created by David on 3/19/2015.
 */
public class VM {

    private Register eax = new Register("EAX", 44);
    private Register ebx = new Register("EBX");
    private Register ecx = new Register("ECX");
    private Register edx = new Register("EDX");
    private ArrayList<Register> allregisters;
    private OpCode op = new OpCode();
    private Code code = new Code();
    private CodeContent cc;

    public VM() {
        allregisters = new ArrayList<Register>();
        allregisters.add(eax);
        allregisters.add(ebx);
        allregisters.add(ecx);
        allregisters.add(edx);
    }

    public void getCode()
    {
        cc = new CodeContent(code);
        code.printStrings();
    }

    public void runCode(String opc, String[] restOfString) {
        op.executeCode(opc, restOfString, this);
    }

    public Register getRegister(String temp)
    {
        Register ans = null;
        for(Register tp : allregisters)
        {
            if(tp.compareString(temp))
                ans = tp;
        }
        return ans;
    }
}
