public class binarySearch
{
    public static void main(String[] args)
    {
        int pos;
        int[] arr = {12,17,31, 52, 87,120, 200};
        System.out.print("In which position is 87 located in the array: ");
        pos = binarySearch(arr,87);
        System.out.println(pos);

        System.out.print("In which position is 17 located in the array: ");
        pos = binarySearch(arr,17);
        System.out.println(pos);

        System.out.print("In which position is 100 located in the array: ");
        pos = binarySearch(arr,100);
        System.out.println(pos);
    }

    public static int binarySearch(int[] arr, int val)
    {
        int first = 0;
        int last = arr.length-1;
        int middle;
        int position = -1;
        boolean found = false;

        while(!found && first <= last)
        {
            middle = (first + last)/2;
            if(arr[middle] == val)
            {
                position = middle;
                found = true;
            }else if(arr[middle] > val)
            {
                last = middle -1;
            }else{
                first = middle +1;
            }
        }
        return position;
    }
}
