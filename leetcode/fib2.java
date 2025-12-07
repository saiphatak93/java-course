public class fib2 {
    public static void main(String[] args) {
        int n = 1000;
        long result = fibq(n, 0, 1);
        System.out.println(result);
    }
    public static long fibq(int n, long a, long b) {

        if (n == 1)
            return b;
        return fibq(n - 1, b, a + b);
    }
}