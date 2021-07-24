import java.text.DecimalFormat;
import java.util.Scanner;

/*

    Payroll Class
    * Displays the hours worked, pay rate of each employee, and the gross pay of each employee

 */

public class PayrollDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Payroll payroll = new Payroll();
        int numOfEmployee = payroll.getNumOfEmployees();
        int[] arr = new int[numOfEmployee];

        for(int i = 0; i < numOfEmployee; i++)
        {
            int n = payroll.getEmployeeId(i);
            arr[i] = n;
        }

        int menuNum = 0;
        do {
            System.out.print("\n\nWelcome to Payroll Demo Program" +
                    "\n1) Display Employee #s:" +
                    "\n2) Input Employee hour/pay rate and display" +
                    "\n3) Display individual employee's gross pay" +
                    "\n4) Show gross pay of every employee" +
                    "\n5) Exit" +
                    "\n Please Choose one of the menu numbers above: ");
            menuNum = sc.nextInt();
            if(menuNum == 1)
            {
                System.out.println("Employee IDs in the database: ");
                for(int i = 0; i < numOfEmployee; i++)
                {
                    System.out.print(payroll.getEmployeeId(i) + " ");
                }
            }else if(menuNum == 2)
            {
                setupEmployee(payroll);

                for(int ct = 0 ; ct < numOfEmployee ; ct++)
                {
                    System.out.println("Employee " + payroll.getEmployeeId(ct) + ": "
                            + "\nHours worked: " + payroll.getHours(ct)
                            + "\nPay Rate: " + payroll.getPayRate(ct) + "\n");
                }

            }else if(menuNum == 3)
            {
                boolean found = false;
                do{
                    System.out.print("Which employeeID would you like to calculate and display the gross pay: ");
                    int id = sc.nextInt();
                    for(int i = 0 ; i < numOfEmployee; i++)
                    {
                        if(id == arr[i])
                        {
                            double gp = payroll.getGrossPay(id);
                            DecimalFormat mF = new DecimalFormat("'$'0.00");
                            System.out.println("Gross pay for " + id + " is " + mF.format(gp));
                            found = true;
                            break;
                        }
                    }
                }while(!found);

            }else if(menuNum == 4)
            {
                System.out.println("Displaying the gross pay for each employee: ");
                for(int i = 0; i < numOfEmployee; i++)
                {
                    double gp = payroll.getGrossPay(payroll.getEmployeeId(i));
                    System.out.println("Employee " + payroll.getEmployeeId(i) + " has gross pay of $" + gp);
                }
            }else if(menuNum == 5)
            {
                System.exit(0);
            }else{
                System.out.println("You have entered the wrong number!");
            }

        }while(menuNum == 1 || menuNum ==2 || menuNum == 3 || menuNum == 4 || menuNum == 5);

    }

    public static void setupEmployee(Payroll emp)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n[Input all the employee information]");
        for(int i = 0; i < emp.getNumOfEmployees(); i++)
        {
            System.out.print("Hours worked from employee " + emp.getEmployeeId(i) + ": ");
            int hr = Integer.parseInt(sc.nextLine());
            emp.setHours(hr,i);
        }

        for(int j = 0; j < emp.getNumOfEmployees(); j++)
        {
            System.out.print("Pay rate from employee " + emp.getEmployeeId(j) + ": ");
            double pr = Double.parseDouble(sc.nextLine());
            emp.setPayRate(pr,j);
        }
    }

}
