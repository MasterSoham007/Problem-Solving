import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2 {

    public static List<Integer> getRow(int rowIndex) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex - i + 1);
            ans = ans / i;
            ansRow.add((int) ans);
        }

        return ansRow;
    }

    public static void main(String[] args) {
        int rowIndex = 5; // Change this value to get the row of Pascal's triangle for a different index
        List<Integer> pascalRow = getRow(rowIndex);

        System.out.println("Row " + rowIndex + " of Pascal's Triangle:");
        for (Integer number : pascalRow) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
