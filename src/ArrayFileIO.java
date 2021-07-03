import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArrayFileIO
{
    public static void main(String[] args) throws FileNotFoundException {
        int[] num = {2,4,6,8};
        PrintWriter pw = new PrintWriter("Values.txt");

        for(int i = 0 ; i <num.length;i++)
        {
            pw.println(num[i]);
        }
        pw.close();
    }
}
