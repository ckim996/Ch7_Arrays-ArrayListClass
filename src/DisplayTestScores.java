import java.util.Scanner;

public class DisplayTestScores
{
    public static void main(String[] args)
    {
        int numOfTest;
        int[] tests;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many tests you have: ");
        numOfTest = sc.nextInt();

        tests = new int[numOfTest];

        for(int i = 0; i < numOfTest ; i++)
        {
            System.out.print("Enter score for Test " + (i+1) + ": ");
            tests[i] = sc.nextInt();
        }

        System.out.println("Here are the numbers you entered: ");
        for(int val:tests)
        {
            System.out.print(val + " ");
        }
    }
}
