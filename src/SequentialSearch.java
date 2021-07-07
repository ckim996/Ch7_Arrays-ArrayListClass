public class SequentialSearch
{
    public static void main(String[] args)
    {
        int[] test = {34,12,59,81,1};
        int results;

        results = sequentialSearch(test,59);

        if(results == -1)
        {
            System.out.println("you did not earn 59 on the test");
        }else{
            System.out.println("you have earned 59 on one of the tests");
        }
    }

    public static int sequentialSearch(int[] arr, int val)
    {
        int i=0;
        int element=-1;
        boolean found=false;

        while(!found && i < arr.length)
        {
            if(arr[i] == val)
            {
                found = true;
                element = i;
            }
            i++;
        }
        return element;
    }
}
