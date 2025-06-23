import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[10];

        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];
            System.out.println("Enter number"+(i+1)+": ");
            numbers[i]= sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];
            System.out.println("element "+(i+1)+"("+num+"):");

            if(num>=18){
                System.out.println("the student with age "+num+" can  vote ");

            }else if(num<0){
                System.out.println("plese enter the positive num");

            }
            else{
                System.out.println("the student with age "+num+" cannot  vote ");
            }
        }
    }
}
