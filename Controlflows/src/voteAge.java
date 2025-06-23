import java.util.Scanner;

public class voteAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 18) {
            System.out.println("he give the vote");
        } else {
            System.out.println("he can't give vote");
        }
    }
}
