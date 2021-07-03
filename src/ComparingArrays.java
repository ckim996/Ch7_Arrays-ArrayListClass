public class ComparingArrays
{
    public static void main(String[] args)
    {
        int[] fArray = {1,2,3,4,5};
        int[] sArray = {1,2,3,4,5};
        int[] tArray = {1,2,3,4,5};
        boolean arrayEqual = true;
        int i = 0;

        if(fArray.length != sArray.length)
        {
            arrayEqual = false;
        }else if(fArray.length != tArray.length)
        {
            arrayEqual = false;
        }else if(sArray.length != tArray.length)
        {
            arrayEqual = false;
        }else{
            arrayEqual = true;
        }

        while(arrayEqual && (i < fArray.length))
        {
            if(fArray[i] != sArray[i])
            {
                arrayEqual = false;
            }else if(fArray[i] != tArray[i])
            {
                arrayEqual = false;
            }else if(sArray[i] != tArray[i])
            {
                arrayEqual = false;
            }else{
                arrayEqual = true;
            }
            i++;
        }

        if(arrayEqual)
        {
            System.out.println("All Three arrays are equal");
        }else{
            System.out.println("All three arrays are not equal");
        }
    }
}
