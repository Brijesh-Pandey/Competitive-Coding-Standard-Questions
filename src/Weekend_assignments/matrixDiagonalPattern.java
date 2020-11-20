// 2nd question asked in Nykaa Coding test
// https://www.geeksforgeeks.org/print-matrix-diagonal-pattern/     (Problem Link)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int [][] mat = new int[n][m];
        for(int i = 0 ;i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        printMatrixDiagonal(mat, n , m);
        
        // Declare the variable
        
   }
    static void printMatrixDiagonal(int mat[][], int n , int m) 
    { 
        int i = 0, j = 0; 
        boolean isUp = true; 
  
        for (int k = 0; k < n * m;) { 
            if (isUp) { 
                for (; i >= 0 && j < m; j++, i--) { 
                    System.out.print(mat[i][j] + " "); 
                    k++; 
                } 
  
                if (i < 0 && j <= m - 1) 
                    i = 0; 
                if (j == m) { 
                    i = i + 2; 
                    j--; 
                } 
            }
             else { 
                for (; j >= 0 && i < n; i++, j--) { 
                    System.out.print(mat[i][j] + " "); 
                    k++; 
                } 
  
                if (j < 0 && i <= n - 1) 
                    j = 0; 
                if (i == n) { 
                    j = j + 2; 
                    i--; 
                } 
            } 
  
        
            isUp = !isUp;
        }
    }
}
