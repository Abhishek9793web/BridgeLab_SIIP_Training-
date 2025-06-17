import java.util.Scanner;
public class SumofNaturalnum {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int number=sc.nextInt();
      if(number<=1){
          System.out.println("plese enter positive num");
          return;
      }
      int sum=number*(number+1)/2;

      int sumloop=0;
      int i=1;
      while(i<=number){
          sumloop+=i;
          i++;
      }
        System.out.println("sum"+sum);
        System.out.println("sumloop"+sumloop);
      if(sumloop==sum){
          System.out.println("both result correct and matched");
      }
      else{
          System.out.println("both result are not correct");
      }


    }
}
