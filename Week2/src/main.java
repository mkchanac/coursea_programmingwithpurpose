public class main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        if (a < b) {
            if (b < c) {
                if (c < a) System.out.println(a + " " + b + " " + c);
                else System.out.println(c + " " + b + " " + a);
            } else System.out.println(a + " " + c + " " + b);
        } else System.out.println(b + " " + a + " " + c);

        if (a > b) c = 0
        else b = 0;
    }
}
