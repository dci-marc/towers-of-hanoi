public class Main {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, a, c, b);
        System.out.println("Move disk " + n + " from tower " + a + " to tower " + b);
        towerOfHanoi(n - 1, c, b, a);
    }
}
