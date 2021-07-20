import java.util.Scanner;

public class Rainfall
{
    public static void main(String[] args)
    {
        int choice = 0;
        final int NUM_MONTHS = 12;
        double[] arr = new double[NUM_MONTHS];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the rainfall data in order from January to December: ");
        for(int i = 0; i < NUM_MONTHS; i++)
        {
            System.out.println("Enter the rainfall data (mm) for month " + (i+1));
            arr[i] = sc.nextDouble();
        }

        System.out.print("Printing the full array: ");
        for(int j = 0; j < NUM_MONTHS; j++)
        {
            System.out.print(arr[j] + " ");
        }

        do {
            System.out.println("\n");
            System.out.print("Choose the following options: \n" +
                    "1. Get Total of the year \n" +
                    "2. Get Average of the year \n" +
                    "3. Get Max Rainfall of the year \n" +
                    "4. Get Min Rainfall of the year \n" +
                    "5. Exit" +
                    "\nChoice (1,2,3,4,5): ");

            choice = sc.nextInt();
            if(choice == 1)
            {
                double total = getTotal(arr);
                System.out.println("Total rainfall (mm): " + total);
            }else if(choice == 2)
            {
                double avg = getAvg(arr);
                System.out.println("Average rainfall (mm): " + avg);
            }else if(choice == 3)
            {
                double max = findMax(arr);
                System.out.println("Max # of the year (mm): " + max);
            }else if(choice == 4)
            {
                double min = findMin(arr);
                System.out.println("Min # of the year (mm): " + min);
            }else if(choice == 5)
            {
                System.exit(0);
            }else{
                System.out.println("Inputted wrong char/num, exiting program!");
            }
        }while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
    }

    public static double getTotal(double[] arr)
    {
        double sum = 0;
        for(int i = 0 ; i < arr.length-1; i++)
        {
            sum += arr[i];
        }

        return sum;
    }

    public static double getAvg(double[] arr)
    {
        double avg;
        double sum = 0;
        for(int i = 0 ; i < arr.length-1; i++)
        {
            sum +=arr[i];
        }
        avg = sum / (arr.length+1);

        return avg;
    }

    public static double findMax(double[] arr)
    {
        double max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }

    public static double findMin(double[] arr)
    {
        double min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
