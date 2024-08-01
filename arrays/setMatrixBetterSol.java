 // Question  =    Answer
// [1 1 0]        [0 0 0]   
// [1 0 1]   =    [0 0 0]   
// [1 1 1]        [1 0 0]   

// T(C)=  O(n * m) + O(n * m) + O(n * m) + O(n * m) + O(n * m) = 5 O(n * m) ~ O(n * m)

import java.util.Scanner;

public class setMatrixBetterSol {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n=3 ,m=3;
        int a [][] = new int [n][m];
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        //Intialize
        System.out.println();
        System.out.println("Enter the element of java");
      for (int i = 0; i < a.length; i++) {  // O(n)
        for (int j = 0; j < a.length; j++) { // O(m)
            a[i][j]=sc.nextInt();
        }
      }
      // Printing
      for (int i = 0; i < a.length; i++) {// O(n)
        for (int j = 0; j < a.length; j++) {// O(m)
          System.out.print(a[i][j]+" ");

        }
        System.out.println();
      }
      System.out.println();

      for (int i = 0; i < a.length; i++) {// O(n)
        for (int j = 0; j < a.length; j++) {// O(m)
        if(a[i][j] == 0)
        {
          row[i] = true;
          col[j] = true;
        }

        }
      }
      for (int i = 0; i < a.length; i++) {// O(n)

        for (int j = 0; j < a.length; j++) {// O(m)
          if (row[i] || col[j])
          {
            a[i][j] =0;
          }
          
          }
      }
      System.out.println();
 // Printing
 for (int i = 0; i < a.length; i++) {// O(n)
    for (int j = 0; j < a.length; j++) {// O(m)
      System.out.print(a[i][j]+" ");

    }
    System.out.println();
  }

    }
}
  
