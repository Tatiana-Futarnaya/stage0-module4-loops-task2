package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i=2;

        while (i<=printToInclusive){
            boolean isPrime = true;
            double squareRoot = Math.sqrt(i) ;
            int r = 2;
            while (r <= squareRoot && isPrime) {
                if (i % r == 0){
                    isPrime = false;
                    break;
                }
                r++;
            }
            System.out.print(isPrime ? (i + "\n") : "");
            i++;
        }
    }
}
