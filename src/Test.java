import java.util.Scanner;

public class Test
{
    public static void main(String []args){
        int[] eI = {5658845,4520125,7895122,87777541,8451277,1302850,7580489};
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < eI.length; i++)
        {
            System.out.print(eI[i] + " ");
        }

        boolean found = false;
        do{
            System.out.print("\nWhich employeeID would you like to calculate the gross pay: ");
            int id = sc.nextInt();
            for( int j = 0; j < eI.length ; j++)
            {
                if (id == eI[j])
                {
                    System.out.println("Found");
                    found = true;
                    break;
                }
            }

        }while(!found); // shows while(found == false)

    }
}
