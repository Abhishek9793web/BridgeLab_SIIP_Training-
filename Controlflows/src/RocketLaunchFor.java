import java.util.Scanner;

public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Counter value");
        int counter=sc.nextInt();
        for(int i=counter;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("Left off!");
    }
}
