public class Payroll
{
    private final int[] employeeID = {5658845,4520125,7895122,87777541,8451277,1302850,7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    public int getHours(int i)
    {
        return hours[i];
    }

    public void setHours(int hrs, int i)
    {
        hours[i] = hrs;
    }

    public double getPayRate(int i)
    {
        return payRate[i];
    }

    public void setPayRate(double payR, int i)
    {
        payRate[i] = payR;
    }

    public double getWages(int i)
    {
        return wages[i];
    }

    public void setWages(double wageS, int i)
    {
        wages[i] = wageS;
    }

    public int getEmployeeId(int i)
    {
        return employeeID[i];
    }

    public int getNumOfEmployees()
    {
        return employeeID.length;
    }

    public double getGrossPay(int ID_Num)
    {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < employeeID.length; i++)
        {
            if(employeeID[i] == ID_Num)
            {
                index = i;
                found = true;

            }
        }

        if(!found)
        {
            System.out.println("Employee Id is non-existent");
            return -1;
        }else{
            setWages(getHours(index) * getPayRate(index),index);
            return getWages(index);
        }
    }
}
