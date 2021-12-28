package inClass2;

public class TestRpChild extends TestRpSuper {
    public int method(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        TestRpSuper t1 = new TestRpChild();
        System.out.println(t1.method(2, 4));
    }
}
