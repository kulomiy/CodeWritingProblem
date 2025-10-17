package looping2;

public class ForLoopNested {
    public String getGrid(int n) {
        String result = "";
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                result += "Row " + row + " Col " + col;
                if (!(row == n && col == n)) result += "\n";
            }
        }
        return result;
    }
}
