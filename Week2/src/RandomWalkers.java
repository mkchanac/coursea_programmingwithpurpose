public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trial = Integer.parseInt(args[1]);
        //>.0 = top, >.25, >.5 = right, >.75 = down, 4 = left
        double direction;
        int x = 0, y = 0, step = 0, sum = 0;

        for (int i = 0; i < trial; i++) {
            while (Math.abs(x) + Math.abs(y) != r) {
                direction = Math.random();
                if (direction > 0.75) {
                    x -= 1;

                } else if (direction > 0.5) {
                    y -= 1;

                } else if (direction > 0.25) {
                    x += 1;

                } else {
                    y += 1;

                }
                step++;
            }
            sum += step;
        }
        double average = sum / (double) trial;
        System.out.println("average number of steps = " + average);
    }
}
