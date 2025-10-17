package looping2;

public class DoWhileLoopNested {
    public String getNumberTriangle(int n) {
        if (n <= 0) return "0";
        String result = "";
        int i = 1;
        do {
            int j = 1;
            do {
                result += j;
                j++;
            } while (j <= i);
            if (i < n) result += "\n";
            i++;
        } while (i <= n);
        return result;
    }
}
