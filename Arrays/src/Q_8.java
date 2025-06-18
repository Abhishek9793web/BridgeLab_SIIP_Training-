import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the num:");
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("error! plese enter the natural num ");
            return;
        }

        int[] oddarray=new int[num/2+1];
        int[] evenarray=new int[num/2+1];

        int oddindex=0,evenindex=0;

        for (int i = 1; i <= num; i++) {
            if(i % 2==0){
                evenarray[evenindex++]=i;
            }else{
                oddarray[oddindex++]=i;
            }
        }
        System.out.println("\nodd number:");
        for (int i = 0; i < oddindex; i++) {
            System.out.print(oddarray[i]+" ");
        }

        System.out.println("\n\neven number");
        for (int i = 0; i < evenindex; i++) {
            System.out.print(evenarray[i]+" ");
        }
        System.out.println();



    }
}
