import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 digits positive number: ");
        Scanner  sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Your number is: " + n);
        int sum=0;
        int mul=1;
        do {
            sum=sum+n%10;
            mul=mul*n%10;
            n=n/10;
        }while (n>0);
        System.out.println(sum);
        System.out.println(mul);
        if (sum%2==0 ||mul%2==0)
            System.out.println("Your num is doubly even");
        else
            System.out.println("Your num is NOT doubly even");
    }
}