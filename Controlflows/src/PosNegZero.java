import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=1){
            System.out.println("num is positive");
        }
        if(num==0){
            System.out.println("num is zero");
        }
        if(num<0){
            System.out.println("num is negative");
        }

    }
}
