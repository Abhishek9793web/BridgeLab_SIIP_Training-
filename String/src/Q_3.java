import java.sql.SQLOutput;
import java.util.Scanner;

public class Q_3 {
    public static void handling(String[] names) {

        try {
            System.out.println("Trying to access index 10 (out of bounds): " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }

    }
    public static void generateException(String[] names){
        System.out.println("Accessing index out of "+names[10]);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] names=new String[5];

        System.out.println("enter  5 name");
        for (int i = 0; i < names.length; i++) {
            names[i]= sc.nextLine();
        }
        System.out.println("generating Exception");
        try {
           generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        System.out.println("Handling Exception");
        handling(names);
    }
}
