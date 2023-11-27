import java.io.*;
import java.util.*;
public class maxSubArray {
    public static int findMaxSubArraySum(int[] arr)
    {
        int max= Integer.MIN_VALUE;
        int tmp =0;
        for (int i=0;i<arr.length; i++)
        {
            tmp=tmp+arr[i];
            if (max<tmp)
            {
                max=tmp;
            }
            if  (tmp<0)
            {
               tmp=0;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res=findMaxSubArraySum(array);
        System.out.println("Максимальная сумма подмасива равна  " + res);
    }
}
