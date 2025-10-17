package looping1;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int n) {
        int i = 1, sum = 0;
        if (n <= 0) return 0;
        do {
            if (i % 2 != 0) sum += i;
            i++;
        } while (i <= n);
        return sum;
    }
}
