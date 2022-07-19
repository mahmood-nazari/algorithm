import java.util.LinkedList;
import java.util.Scanner;

public class BfsSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col = scanner.nextInt();
        int row = scanner.nextInt();
        Integer[][] land = new Integer[row][col];
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                land[i][j] = scanner.nextInt();
            }
        LinkedList<BfsPoint> queue = new LinkedList<>();
        queue.add(new BfsPoint(0, 0));
        while (!queue.isEmpty()) {
            int newRow = queue.get(0).row;
            int newCol = queue.get(0).col;
            if (visited[newRow][newCol]) {
                queue.removeFirst();
                continue;
            }
            if (newRow != queue.get(0).row && newCol != queue.get(0).col) {
                queue.add(new BfsPoint(newRow, newCol));
            }
            visited[newRow][newCol] = true;
            System.out.println(land[queue.get(0).row][queue.get(0).col]);
            BfsPoint pop = queue.pop();
            if (pop.col < col - 1) {
                int newColAdj = colAdj(pop.col, pop);
                queue.add(new BfsPoint(pop.row, newColAdj));
            }
            if (pop.row < row - 1) {
                int newRowAdj = rowAdj(pop.row, pop);
                queue.add(new BfsPoint(newRowAdj, pop.col));
            }
        }
    }

    private static int colAdj(int col, BfsPoint pop) {
        col = pop.col + 1;
        return col;
    }

    private static int rowAdj(int row, BfsPoint pop) {
        row = pop.row + 1;
        return row;
    }

}

class BfsPoint {
    int row;
    int col;

    public BfsPoint(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
