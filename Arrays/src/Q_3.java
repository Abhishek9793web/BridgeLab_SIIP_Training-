import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number<0){
            System.out.println("please enter the positive num");
            return;
        }
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(factors[i]+" ");
        }
        System.out.println();

    }
}
