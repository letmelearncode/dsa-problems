package backtracking;

public class OneDQueenCombination {
    private static int count = 0;

    public static void main(String[] args) {
        int noOfQueens = 2;
        int noOfBoxes = 4;
        boolean[] visited = new boolean[noOfBoxes];
        printCombination(0, noOfQueens, visited, "", -1);
        System.out.println("Total count = " + count);
    }

    private static void printCombination(int qvsf, int noOfQueens, boolean[] visited, String ans, int lastBoxUsed) {

        if (qvsf == noOfQueens) {
            count++;
            System.out.println(ans);
            return;
        }
        for (int i = lastBoxUsed+1; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                printCombination(qvsf + 1, noOfQueens, visited, ans + "q" + qvsf + "b" + i + " ",i );
                visited[i] = false;
            }
        }
    }

}
