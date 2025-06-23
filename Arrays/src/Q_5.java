import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];

        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];
            System.out.println("Enter number"+(i+1)+": ");
            numbers[i]= sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];
            System.out.println("element "+(i+1)+"("+num+"):");

            if(num>0){
                if(num%2==0){
                    System.out.println("num is pos and even");
                }
                else{
                    System.out.println("num is pos and odd");
                }

            }else if(num<0){
                System.out.println("num is neg");

            }
            else{
                System.out.println("num is zero");
            }
        }
        int first=numbers[0];
        int last=numbers[4];
        System.out.println("Compare first and last element");
        if(first==last){
            System.out.println("both are equal");
        }
        else if(first>last){
            System.out.println("first ele is greater");
        }
        else{
            System.out.println("last ele is greater");
        }
    }

}
