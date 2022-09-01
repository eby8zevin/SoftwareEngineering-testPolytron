class Test { // Question 3
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            // Answer
            y += 2;
            if (x == 2) {
                x = 3;
            }
            // Answer
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
// Output = 02 14 36 48