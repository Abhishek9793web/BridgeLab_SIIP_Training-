
import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

        System.out.println("enter the row ");
        int row=sc.nextInt();

        System.out.println("enter the col: ");
        int col=sc.nextInt();

        int[][] matrix=new int[row][col];
        System.out.println("enter the ele for 2d array:");
        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }


        int[] array=new int[row*col];
        int index=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[index++]=matrix[i][j];
            }
        }



        System.out.println("1D ele copyed from 2d:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }
}
