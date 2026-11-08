class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке dev");
    }

    static void printDevInfo() {
        System.out.println("\nВетка dev: добавлен метод printDevInfo()");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void printEvenNumbers(int n) {
        System.out.print("Четные до " + n + ": ");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}