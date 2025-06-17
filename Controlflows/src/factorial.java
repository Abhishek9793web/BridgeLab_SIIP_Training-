import java.util.Scanner;
    public class factorial {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int number=sc.nextInt();

            long fact=1;
            for(int i=1;i<=number;i++){
                fact *=i;

            }
            System.out.println("Factorial of "+number+" is "+fact);
        }


    }


