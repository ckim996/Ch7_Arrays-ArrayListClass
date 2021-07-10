public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {5,8,2,4,1};
        selectionSortASC(arr);
        System.out.println("Ascending Selection Sort: ");
        for(int i = 0; i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nDescending Selection Sort: ");
        selectionSortDSC(arr);
        for(int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
    }

    public static void selectionSortASC(int[] arr)
    {
        int startScan, minIndex, minValue, i;
        for(startScan = 0; startScan < (arr.length-1); startScan++)
        {
            minIndex = startScan;
            minValue = arr[startScan];
            for(i = startScan + 1; i < arr.length; i++)
            {
                if(arr[i] < minValue)
                {
                    minValue = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex] = arr[startScan];
            arr[startScan] = minValue;
        }
    }

    public static void selectionSortDSC(int[] arr)
    {
        int startScan, maxIndex, maxValue, i;
        for(startScan = 0; startScan < (arr.length-1); startScan++)
        {
            maxIndex = startScan;
            maxValue = arr[startScan];
            for(i = startScan + 1; i < arr.length; i++)
            {
                if(arr[i] > maxValue)
                {
                    maxValue = arr[i];
                    maxIndex = i;
                }
            }
            arr[maxIndex] = arr[startScan];
            arr[startScan] = maxValue;
        }
    }
}
