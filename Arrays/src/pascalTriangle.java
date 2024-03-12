import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            ansRow.add((int) ans);
        }

        return ansRow;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        int numRows = 5; // Change this value to generate Pascal's triangle with different number of rows
        List<List<Integer>> pascalsTriangle = generate(numRows);

        // Printing Pascal's Triangle
        for (List<Integer> row : pascalsTriangle) {
            for (Integer number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
