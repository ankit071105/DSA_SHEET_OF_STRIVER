
// Pascal Triangle 
//             1                    no of mid value =   0 mid = 1
//          1     1                 no of mid value =   1 mid = 1+1 = 2
//       1     2     1              no of mid value =   2 mid = 1+2 =3 ,mid = 1+2 =3
//     1    3      3     1          no of mid value =   3 mid = 1+3 =4 , mid = 3+3 =6 , mid = 1+3 =4
//   1    4     6     4      1      no of mid value =   4 mid = 1+4 =5 , mid = 4+6 =10 , mid = 6+4 =10, mid = 4+1 =5
// 1    5    10    10     5     1
//
public class pascaltriangle {
    public static void generateRow(int row) {
        long ans = 1;
        System.out.print(1 + " "); 
        
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            System.out.print(ans + " ");
        }
        
        System.out.println(); 
    }

    public static void pascalTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            generateRow(row);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        pascalTriangle(n);
    }
}
