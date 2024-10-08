package arrays.easy;

public class MatrixReshape {

  public int[][] matrixReshape(int[][] mat, int r, int c) {
    int m = mat.length;
    int n = mat[0].length;

    if (m * n == r * c) {
      int[][] ansMat = new int[r][c];
      int a = 0;
      int b = 0;

      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {

          if (a < m) {
            if (b < n) {
              ansMat[i][j] = mat[a][b++];
            } else {
              a++;
              b = 0;
              ansMat[i][j] = mat[a][b++];
            }
          } else {
            break;
          }
        }
      }
      return ansMat;
    } else {
      return mat;
    }

  }

  public static void main(String[] args) {
    MatrixReshape mt = new MatrixReshape();
    int[][] originalMatrix = {{1, 2}, {3, 4}};
    int newRow = 2;
    int newColumn = 4;
    int[][] newMatrix = mt.matrixReshape(originalMatrix, newRow, newColumn);

    for (int i = 0; i < newRow; i++) {
      for (int j = 0; j < newColumn; j++) {
        System.out.print(newMatrix[i][j]+" ");
      }
      System.out.println("");
    }
  }
}