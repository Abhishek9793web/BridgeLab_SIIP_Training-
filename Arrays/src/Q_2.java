import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        if(num<0){
            System.out.println("plese enter the positive num");
        }
        String[] result=new String[num+1];
        for(int i=0;i<=num;i++){
         if(i%3==0){
             result[i]="fun";
         }
          else if(i%5==0){
                result[i]="buzz";
          }
          else  if(i%3==0 && i%5==0){
                result[i]="funbuzz";
          }
          else if(i==0){
              result[i]="0";
         }
          else{
              result[i]=Integer.toString(i);
         }
        }
        for(int i=0;i<num;i++){
            System.out.println("position"+i+"="+result[i]);
        }
    }
}
