 // Question  =    Answer
// [1 1 0]        [0 0 0]   
// [1 0 1]   =    [0 0 0]   
// [1 1 1]        [1 0 0]   

// TC O(N)= (n * n)*(n + n) + (n *n)  ~ O(n^3)
import java.util.Scanner;

public class setMatrixBruteSol {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int a [][] = new int [3][3];
       
        //Intialize

        System.out.println("Enter the element of java");
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            a[i][j]=sc.nextInt();
        }
      }
     
      // Printing
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
          System.out.print(a[i][j]+" ");

        }
        System.out.println();
      }
      System.out.println();
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
           if(a[i][j]== 0)
           {
            markRow(a, i);
            markCol(a, j);
           }
        }
      }
      //Priniting the Brute new array
      System.out.println("Printing the Brute new array");
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
          System.out.print(a[i][j]+" ");

        }
        System.out.println();
      }
    }
    // BRUTE SOLUTION
    public static void markRow(int a[][], int row) {
        for (int j = 0; j < a[row].length; j++) {
            a[row][j] = 0;
        }
    }

    public static void markCol(int a[][], int col) {
        for (int i = 0; i < a.length; i++) {
            a[i][col] = 0;
        }
    }

    





}