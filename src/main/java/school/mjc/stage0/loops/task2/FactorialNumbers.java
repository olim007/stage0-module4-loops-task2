package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int f = 1;
        int j = 1;
        System.out.println(i + 1);
        while (i < printToInclusive) {

//
//            while (j <= i) {
//                f *= j;
//                j++;
//            }
            f = f * j;
            System.out.println(f);
            i++;
            j++;
        }
    }

//    public void factorial(int f) {
//
//    }

//    public static void main(String[] args) {
//        printFactorialRow(7);
//    }
}
