class Test {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0); // This will throw an ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed
        } finally {
            // Code that will always be executed, even if an exception occurred
            System.out.println("Cleanup or final actions here");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
