import java.util.Scanner;

public class DoubleArrayEx1
{
    public static void main(String[] args)
    {
        final int DIVS = 3; // 3 divisions in the company
        final int QTRS = 4; // 4 quarters
        double totalSales = 0.0;

        double[][] sales = new double[DIVS][QTRS];

        Scanner sc = new Scanner(System.in);

        System.out.println("This program calculates the total sales of all the company's divisions. Enter the following data: ");

        for(int i = 0; i <  DIVS; i++)
        {
            for(int j = 0 ; j < QTRS; j++)
            {
                System.out.printf("Division %d, Quarter %d: $", (i+1), (j+1));
                sales[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for(int div = 0; div < DIVS ; div++)
        {
            for(int qtr = 0; qtr < QTRS ; qtr++)
            {
                totalSales += sales[div][qtr];
            }
        }

        System.out.printf("Total company sales: $%.2f\n",totalSales);

    }
}
