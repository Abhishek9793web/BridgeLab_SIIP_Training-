import java.util.Scanner;
class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the a : ");
    double a=sc.nextInt();
  
    double yards =a/3; ;
    double mile=yards/1760;
  
    System.out.print(" The distance in yards is"+yards);
    System.out.print("  while the distance in miles is"+mile);
   sc.close();
 }
}