import java.util.Scanner;

public class PassArray
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 4;
        int[] num = new int[ARRAY_SIZE];
        getValues(num);

        System.out.print("Array values: ");

        showArray(num);
    }

    /*
    getValues method accepts a reference to an array as its argument. The
    User is asked to enter a value for each element
     */
    public static void getValues(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter: " + arr.length + " values for your array: ");
        for(int i = 0; i < arr.length;i++)
        {
            System.out.println("Value " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void showArray(int[] arr)
    {
        for(int i = 0; i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
