import java.util.Scanner;

public class findsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int sum=0;
        while(true){
            System.out.println("Enter the netural num");
            int num=sc.nextInt();
            if(num<=0){
                break;
            }
            sum+=num;
        }
        System.out.println("sum of netural num"+sum);
    }
}
