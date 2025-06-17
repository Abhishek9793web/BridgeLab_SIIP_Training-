import java.util.Scanner;
import java.util.Scanner;
public class firstSmallNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        if(a<b && a<c){
            System.out.println("number a is smallest");
        }
        if(b<a && b<c){
            System.out.println("number b is smallest");
        }
        if(c<a && c<b){
            System.out.println("number c is smallest");
        }else{
            System.out.println("no one are smallest");
        }

    }

}
