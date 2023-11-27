public class SumOfPair {
    public static void findSum(int[] arr,int target)
    {
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    count++;
                    System.out.printf("Подходящие пары чисел " + count + "-я пара : " + Integer.toString(arr[i]) + ", " + Integer.toString(arr[j]) + "\n");
                }
            }
        }
        if (count == 0)
        {
            System.out.printf("Нет подходящих пар чисел \nnull");
        }



    }
    public static void main(String[] args)
    {
        int target =10;
        int[] arr = { 1,2,3,4,5 };
        findSum(arr,target);
    }
}
