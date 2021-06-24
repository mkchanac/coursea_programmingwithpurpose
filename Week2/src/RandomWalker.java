public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        //>.0 = top, >.25, >.5 = right, >.75 = down, 4 = left
        double direction;
        int x = 0, y = 0, step = 0;
        System.out.println("(" + x + "," + y + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            direction = Math.random();
            if (direction > 0.75) {
                x -= 1;
                System.out.println("(" + x + "," + y + ")");
            } else if (direction > 0.5) {
                y -= 1;
                System.out.println("(" + x + "," + y + ")");
            } else if (direction > 0.25) {
                x += 1;
                System.out.println("(" + x + "," + y + ")");
            } else {
                y += 1;
                System.out.println("(" + x + "," + y + ")");
            }
            step++;
        }
        System.out.println("steps = " + step);


    }
}
