import java.util.Scanner;

class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the height in cm: ");
    int a=sc.nextInt();
     float inch=a/2.54f;
      float feet=a/inch;
    
 
    System.out.print("Your Height in cm is "+a+" while in feet is"+feet+" and inches is"+inch);
   sc.close();
 
 }

}