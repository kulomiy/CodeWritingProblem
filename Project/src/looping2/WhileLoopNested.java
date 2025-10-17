package looping2;

public class WhileLoopNested {
    public String getTriangle(int n) {
        String result = "";
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                result += "*";
                j++;
            }
            if (i < n) result += "\n";
            i++;
        }
        return result;
    }
}
