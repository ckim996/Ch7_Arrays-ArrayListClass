import java.util.Scanner;

public class ArrayIntro
{
    public static void main(String[] args)
    {
        final int TEST = 5;
        int[] num1 = new int[3];
        int[] num2 = new int[TEST];
        int[] num3 = {3,9,11,4,2,16,34,12};

        System.out.println("Input 3 Values:");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<=num1.length-1; i++)
        {
            num1[i] = sc.nextInt();
        }

        System.out.print("Stored the following numbers inside num1: ");
        for(int i = 0; i <3;i++)
        {
            System.out.print(num1[i]+ " ");
        }
        System.out.println();

        System.out.println("Input 6 values: ");
        for(int j = 0; j<=TEST-1; j++)
        {
            num2[j] = sc.nextInt();
        }

        for(int z = 0; z<= TEST-1; z++)
        {
            System.out.print(num2[z] + " ");
        }

        System.out.println();

        System.out.println("Display array num3: ");
        for(int y = 0; y <= num3.length-1;y++)
        {
            System.out.print(num3[y] + " ");
        }
    }
}
