package ads_week1_antwoorden;

public class PrimeFactorization {

    /** 
     * Kan je deze functie sneller maken?
     * 
     * Zoekt een priemfactor van n.
     * @return Kleinste priemfactor van n, of n als n eem priem is.
     */
    static long zoekFactor(long n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return i;
        return n;
    }

    public static void main(String[] args) {
        long[] longNumbers = { 27947197, 69804209, 927584033, 283583819, 261022493, 829372787, 2095726453 };

        for (long number : longNumbers) {
            System.out.print("Factorisatie van " + number + ". ");
            System.out.println("Oplossing: " + zoekFactor(number));
        }

    }
}
