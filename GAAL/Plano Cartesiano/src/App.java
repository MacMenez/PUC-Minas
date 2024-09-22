public class App {
    public static void main(String[] args) throws Exception {
        char[][] matrix = new char[14][14];

        for (int i = 1; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                // matrix[i][j] = (char) ('x' + ":" + i + 'y' + ':' + j);
                matrix[i][j] = '-';
            }
        }

        for (int i = 1; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
