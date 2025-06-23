import java.util.Scanner;

class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first : ");
    int a=sc.nextInt();
    
    double Miles = a * 0.621371;
    System.out.print(" miles  is: "+Miles);
   sc.close();
 
 }

}