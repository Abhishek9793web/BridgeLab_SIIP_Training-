import java.util.Scanner;

class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Fee : ");
    int a=sc.nextInt();
    System.out.print("Enter the UniDiscount : ");
    int b=sc.nextInt();
    int discounted_amount=(a*b)/100;
    int discounted_price=a-discounted_amount; 
    
    
    System.out.print(" discounted_amount  is:INR "+discounted_amount);
    System.out.print(" discounted_price: INR"+discounted_price);
   sc.close();
 
 }
}