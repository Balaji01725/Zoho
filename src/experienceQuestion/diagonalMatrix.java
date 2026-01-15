package experienceQuestion;

public class diagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{6,7,8}};
        diagonalTraversal(matrix);
    }
    static void diagonalTraversal(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        for(int d = 0; d < r+c-1; d++){
            int row = d < c ? 0 : d - c + 1;
            int col = d < c ? d : c - 1;

            while(row < r && col >= 0){
                System.out.print(matrix[row][col] +" ");
                row++;
                col--;
            }
            System.out.println();
        }
    }
}
