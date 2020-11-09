/*Develop a Java program to find the transpose of a given matrix of order MXN.*/
import java.util.*;
class transpose{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int m,n;
    System.out.println("Enter order of the matrix MxN");
    m=in.nextInt();
    n=in.nextInt();
    int matrix[][]=new int[m][n];
    System.out.println("Enter elements of matrix");
    for (int i=0;i<m;i++ ) {
      for (int j=0;j<n;j++ ) {
        matrix[i][j]=in.nextInt();
      }
    }
    System.out.println("Transpose of a given matrix is");
    int transmatrix[][]=new int[n][m];
    for (int i=0;i<n;i++ ) {
      for (int j=0;j<m;j++ ) {
        transmatrix[i][j]=matrix[j][i];
        System.out.print(transmatrix[i][j] + "  ");
      }
      System.out.println();
    }
  }
}
