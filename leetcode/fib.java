
class fib {

    public static void main(String[] args) {
        int out = recurr(50);
        System.out.println(out);
    }

    public static int recurr(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return recurr(n - 1) + recurr(n - 2);
    }
}
