import java.util.Arrays;
public class UnionSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {


        int[] Union  = new int[arr1.length + arr2.length];

        int arr1pos, arr2pos, unipos;
        arr1pos = arr2pos = unipos = 0;

        while(arr1pos < arr1.length && arr2pos < arr2.length) {
            if (arr1[arr1pos] < arr2[arr2pos]) {
                Union[unipos++] = arr1[arr1pos++];
            } else {
                Union[unipos++] = arr2[arr2pos++];
            }
        }

        while (arr1pos < arr1.length) {
            Union[unipos++] = arr2[arr1pos++];
        }

        while (arr2pos < arr2.length) {
            Union[unipos++] = arr2[arr2pos++];
        }

        return Union;
    }

    public static void main(String[] args)
    {
        int[] array1= { 1, 2,10,51 };
        int[] array2= { 4, 8, 11 ,20,100};
        int[] merged=merge(array1,array2);
        System.out.println("Объединенный массив " + Arrays.toString(merged));

    }
}

