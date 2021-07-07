public class DisplayingArray
{
    public static void main(String[] args)
    {
        // Printing all values inside double array
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Printing all the values inside the double array");

        showArray(num);

        System.out.println();

        // Printing the sum of all values in array
        System.out.print("Printing out the sum of the values in the array: ");
        int sum1 = arrSum(num);
        System.out.print(sum1);

        System.out.println();

        // Printing the sum of each row
        System.out.println("\nPrinting out the sum of each row: ");
        arrSumRow(num);

        System.out.println();

        // Printing the sum of each column
        System.out.println("\nPrinting out the sum of each column: ");
        int totalC = 0;
        for(int j = 0 ; j < num[0].length; j++)
        {
            totalC = 0;
            for(int i = 0; i < num.length;i++)
            {
                totalC += num[i][j];
            }
            System.out.println("Total of columns: " + j + " is " + totalC);
        }
    }

    public static void showArray(int[][] arr)
    {
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int arrSum(int[][] arr)
    {
        int total = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                total+=arr[i][j];
            }
        }
        return total;
    }

    public static void arrSumRow(int[][] arr)
    {
        int total = 0;
        for(int i = 0; i < arr.length;i++)
        {
            total = 0;
            for(int j = 0; j< arr[i].length; j++)
            {
                total += arr[i][j];
            }
            System.out.println("total of row " + i + " is " + total);
        }

    }
}
