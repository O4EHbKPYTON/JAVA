import java.util.*;
class Main {
    public static void main(String[] args) {
                System.out.printf("Enter positive number    ");
                Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();
                System.out.printf("Your number is " + n+"\n");
                System.out.printf("Enter " + n + " digits");
                int[] arr= new int[n];
                for (int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                int sum=0;
                for (int i=0;i<n;i++){
                    if (i%2==0)
                        sum+=arr[i];
                    else
                        sum-=arr[i];
                }
                System.out.printf("Sum is " + sum);
        }
    }
