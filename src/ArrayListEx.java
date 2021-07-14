import java.util.ArrayList;

public class ArrayListEx
{
    public static void main(String[] args)
    {
        //int[] val = {4,7,6,8,2};
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Bill");
        nameList.add("Inge");
        nameList.add("Catherine");

        System.out.println(nameList);

        int[] val = {4,7,6,8,2};
        int x = ++val[1];
        System.out.println(x);
    }
}