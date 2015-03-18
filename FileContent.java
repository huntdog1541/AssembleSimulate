import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;

/**
 * Created by David on 3/9/2015.
 */
public class FileContent {

    private File fl;

    public FileContent()
    {
        fl = new File("temp.asb");
    }

    public FileContent(File temp)
    {
        fl = temp;
    }

    public String getFileContent()
    {
        //BufferedReader bfrd = new BufferedReader(new Reader(fl));
        StringBuilder sb = new StringBuilder();

        //sb.append(fl.get);
        return null;
    }
}
