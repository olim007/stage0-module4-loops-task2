package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        int i = 0;
        int p = 1;
        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        System.out.println(p);
        while (i < power) {
            p *= 2;
            System.out.println(p);
            i++;
        }
    }

    public static void main(String[] args) {
        printPower(4);
    }
}
