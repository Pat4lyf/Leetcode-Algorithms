/** https://leetcode.com/problems/rotate-image/ */

import java.util.Arrays;

public class RotatedMatrix {
   static boolean rotateMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] rotatedMatrix = new int[size][size];
        int j = 0;

        for(int i= size-1; i>=0; i--) {
            for(int k=0; k<size; k++) {
                rotatedMatrix[k][j] = matrix[i][k];
            }
            j++;
        }

        for(int i=0; i<size; i++) {
            System.arraycopy(rotatedMatrix[i], 0, matrix[i], 0, size);
        }
       System.out.println(Arrays.deepToString(matrix));
        return true;
    }


    public static void main(String[] args) {
        System.out.println(rotateMatrix(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }
}
