/**
 * Created by David on 3/7/2015.
 */
public class MemoryStorage {

    private char[] strng;
    private int temp;
    private int[] mem;

    public MemoryStorage()
    {
        strng = new char[32];
        temp = 0;
        mem = new int[170];
    }
}
