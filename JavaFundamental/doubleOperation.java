import java.util.Scanner;
class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the a : ");
    double a=sc.nextInt();
     System.out.print("Enter the b : ");
     double b=sc.nextInt();
     System.out.print("Enter the c : ");
     double c=sc.nextInt();
    double S = (a+b*c);
    double t=(a*b+c);
    double u=(c+a/b);
    double v=(a%b+c);
    System.out.print(" The results of Double Operations are"+S);
    System.out.print(" The results of Double Operations are"+t);
    System.out.print(" The results of Double Operations are"+u);
    System.out.print(" The results of Double Operations are"+v);
   sc.close();
 }
}