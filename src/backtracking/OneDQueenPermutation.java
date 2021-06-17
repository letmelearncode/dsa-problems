package backtracking;

/**
 * The class provides number of different ways to arrange 2 queens in 4
 * boxes (1 D Queen Permutation).
 */
public class OneDQueenPermutation {

    private static int count = 0;

    public static void main(String[] args) {
        int noOfQueens = 3;
        int noOfBoxes = 5;
        boolean[] visited = new boolean[noOfBoxes];
        printPermutation(0, noOfQueens, visited, "");
        System.out.println("Total count = " + count);
    }

    private static void printPermutation(int qvsf, int noOfQueens, boolean[] visited, String ans) {

        if (qvsf == noOfQueens) {
            count++;
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                printPermutation(qvsf + 1, noOfQueens, visited, ans + "q" + qvsf + "b" + i + " ");
                visited[i] = false;
            }
        }
    }

}
