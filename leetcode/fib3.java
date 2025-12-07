import oops.Calculator;

class fib3 {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));

        int n = 50;
        fib3 obj = new fib3(); 
        int result = obj.fib(n);

        System.out.println(result);
    }

    public int fib(int n) {

        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        return recurr(n, dp);
    }

    int recurr(int n, int[] dp) {

        if (dp[n] != -1) {
            return dp[n];
        }

        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }

        dp[n] = recurr(n - 1, dp) + recurr(n - 2, dp);
        return dp[n];
    }
}
