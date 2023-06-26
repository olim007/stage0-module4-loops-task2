package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public boolean isPrime(int number) {
        if (number == 1 || number == 0) {
            return false;
        }
        int i = 2;
        while (i * i <= number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
