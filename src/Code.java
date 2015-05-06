import java.util.ArrayList;

/**
 * Created by David on 3/20/2015.
 */
public class Code {

    private String currentCode;
    private ArrayList<String> code;
    private int iterator;

    public Code()
    {
        currentCode = new String();
        code = new ArrayList<String>();
        iterator = 0;
    }

    public void addString(String temp)
    {
        code.add(temp);
    }

    public String getString(int iter)
    {
        return code.get(iter);
    }

    public String getNextString()
    {
        return code.get(iterator);
    }

    public void printStrings()
    {
        for(String i : code)
            System.out.println(i);
    }
}
