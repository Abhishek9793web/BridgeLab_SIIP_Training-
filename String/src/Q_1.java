import java.sql.SQLOutput;
import java.util.Scanner;

public class Q_1 {
    public  static  boolean compwithcharat(String s1,String s2){
        if(s1.length() !=s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        System.out.println("Enter the first str");
        String s1=sc.next();
        System.out.println("Enter the second str");
        String s2= sc.next();

        boolean mutualcomp=compwithcharat(s1,s2);

        boolean buildincomp=s1.equals(s2);

        System.out.println("\nMutual Comparition "+mutualcomp);
        System.out.println("Build in comp :"+buildincomp);

        if(mutualcomp ==buildincomp){
            System.out.println("both method give same result");
        }
        else{
            System.out.println("not same result");
        }
    }
}
