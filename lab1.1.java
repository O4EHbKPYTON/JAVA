import  java.util.*;
class Main {
    public static void main(String[] args) {
            System.out.println("Enter number");
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            System.out.println("Your number is "+n);
            int steps=0;
            do {
                steps++;
                if ((n%2==0))
                    n=n/2;
                else
                    n=3*n+1;
            } while (n>1);
            System.out.println("Amount of steps = "+steps);
    }
}