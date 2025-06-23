import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total=0.0;
        double[] number =new double[10];
        int index=0;
        while(true){
            System.out.print(" Enter the number ");
             double input=sc.nextDouble();
           if(input<=0){
               break;
           }
           if(index==10){
               System.out.println("index is full");
               break;
           }
           number[index]=input;
           index++;
        }
        System.out.println("you enter");
        for(int i=0;i<index;i++){
            System.out.println(number[i]);
            total +=number[i];
        }
        System.out.println("Total sum:"+total);
    }
}
