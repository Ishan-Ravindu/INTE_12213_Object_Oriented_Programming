package inClass2;

public class TestCp {
    static int method(int x, int y) {
        return x + y;
    }

    static int method(int x) {
        return x;
    }

    public static void main(String[] args) {
        System.out.println(method(5));
        System.out.println(method(2, 4));
    }
}
