import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by David on 3/18/2015.
 */
public class CodeContent {

    private File fle;
    private BufferedReader flread;
    private StringBuilder sb;
    private Code code;

    public CodeContent() {
        try {
            flread = new BufferedReader(new FileReader("assmb.txt"));
            sb = new StringBuilder();
            getCode();
        } catch (FileNotFoundException e) {

        }
    }

    public CodeContent(Code temp)
    {
        code = temp;
        try {
            flread = new BufferedReader(new FileReader("assmb.txt"));
            sb = new StringBuilder();
            getCode();
        } catch (FileNotFoundException e) {

        }
    }

    public CodeContent(String fileName)
    {

    }

    public void getCode()
    {
        String temp;
        try
        {
            temp = flread.readLine();
            while(temp != null)
            {
                code.addString(temp);
                temp = flread.readLine();
            }
        }
        catch(java.io.IOException e)
        {

        }
    }

}
