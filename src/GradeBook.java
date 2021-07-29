import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook
{
    public static void main(String[] args)
    {
        final int S_NUM = 5;
        final int NUM_OF_TESTS = 4;
        ArrayList<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sName ="";

        for(int i = 0; i < S_NUM; i++)
        {
            System.out.print("Enter student " + (i+1) + " name: ");
            sName = sc.nextLine();
            nameList.add(sName);
        }

        System.out.println(returnName(nameList));

        System.out.println("\nStudents in the class: ");
        for(int j = 0; j < nameList.size(); j++)
        {
            System.out.println(nameList.get(j));
        }

        double testScore;

        double[] s1 = new double[NUM_OF_TESTS];
        System.out.println("Enter 4 test scores for " + nameList.get(0) + ": ");
        for(int k = 0; k < NUM_OF_TESTS; k++)
        {
            System.out.print("Test score for test " + (k+1) + ": ");
            testScore = sc.nextDouble();
            s1[k] = testScore;
        }

        double[] s2 = new double[NUM_OF_TESTS];
        System.out.println("Enter 4 test scores for " + nameList.get(1) + ": ");
        for(int k = 0; k < NUM_OF_TESTS; k++)
        {
            System.out.print("Test score for test " + (k+1) + ": ");
            testScore = sc.nextDouble();
            s2[k] = testScore;
        }

        double[] s3 = new double[NUM_OF_TESTS];
        System.out.println("Enter 4 test scores for " + nameList.get(2) + ": ");
        for(int k = 0; k < NUM_OF_TESTS; k++)
        {
            System.out.print("Test score for test " + (k+1) + ": ");
            testScore = sc.nextDouble();
            s3[k] = testScore;
        }

        double[] s4 = new double[NUM_OF_TESTS];
        System.out.println("Enter 4 test scores for " + nameList.get(3) + ": ");
        for(int k = 0; k < NUM_OF_TESTS; k++)
        {
            System.out.print("Test score for test " + (k+1) + ": ");
            testScore = sc.nextDouble();
            s4[k] = testScore;
        }

        double[] s5 = new double[NUM_OF_TESTS];
        System.out.println("Enter 4 test scores for " + nameList.get(4) + ": ");
        for(int k = 0; k < NUM_OF_TESTS; k++)
        {
            System.out.print("Test score for test " + (k+1) + ": ");
            testScore = sc.nextDouble();
            s5[k] = testScore;
        }

        System.out.print("Test scores for " + nameList.get(1) + ": ");
        for(int z = 0; z < NUM_OF_TESTS; z++)
        {
            System.out.print(s1[z] + " ");
        }
    }

    public static String returnName(ArrayList<String> nList)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("From 1 to 5, choose a number to return the student's name: ");
        int num = kb.nextInt();

        return nList.get(num-1);
    }
}
