import java.util.Scanner;

public class Q_2 {
    public static String touppercase(String text){


        StringBuilder result=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
             char ch=text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // Convert to uppercase
            }
            result.append(ch);
        }
        return result.toString();

    }
    public static boolean compstring(String s1,String s2){
        if(s1.length() !=s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the text: ");
        String input= sc.nextLine();

        String munualupper=touppercase(input);
        String buildin=input.toUpperCase();

        boolean issame=compstring(munualupper,buildin);

        System.out.println("Munual Upper: "+munualupper);
        System.out.println("Build in : "+buildin);
        System.out.println("Is same:  "+issame);

    }

}
