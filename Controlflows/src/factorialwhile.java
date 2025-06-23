import java.util.Scanner;

public class factorialwhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
         if (number<1){
             System.out.println("Plese enter the positive num");
         }
         if(number==1 ||number==2){
             System.out.println(number);
         }
         int num=number;
        long fact=1;
        while(num>=1){
            fact *=num;
           num--;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
