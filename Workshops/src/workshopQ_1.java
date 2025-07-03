import java.util.Scanner;

public class workshopQ_1 {
    static Scanner scanner=new Scanner(System.in);

    static class student{
        String name;
        String id;
        Integer[] grades;

        student(String name,String id,int SubjectCount){
            this.name=name;
            this.id=id;
            this.grades=new Integer[SubjectCount];
        }

        double average(){
            int sum = 0, count = 0;
            for (Integer g : grades) {
                if (g != null) {
                    sum += g;
                    count++;
                }
            }
            return count == 0 ? 0 : (double) sum / count;
        }
        int total(){
            int sum = 0;
            for (Integer g : grades) {
                if (g != null) sum += g;
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println("Enter the number of student");
            int totalStudent=scanner.nextInt();

            System.out.println("Enter the number of subject");
            int totalSubject=scanner.nextInt();

            student[] students=new student[totalStudent];

        }

    }
}
