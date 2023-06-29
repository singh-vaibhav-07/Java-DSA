public class spiral_matrix {
    public static void spiralMatrix(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top = row -> fixed , col -> variable
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right = col -> fixed , row -> variable
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Bottom = end Row -> fixed , col -> variable
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }

            // Left = col -> fixed , row -> variable
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // output = 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        spiralMatrix(arr);

    }
}
