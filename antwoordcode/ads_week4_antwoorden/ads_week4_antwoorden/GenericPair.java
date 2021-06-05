package ads_week4_antwoorden;

import java.util.ArrayList;

public class GenericPair {
    public static void main(String[] args) {
        Pair<Integer, String> myPair = new Pair<>(3, "drie");
        Pair<Integer, String> myPair2 = new Pair<>(7, "zeven");
        Pair<Integer, String> myPair3 = new Pair<>(5, "vijf");

        ArrayList<Pair<Integer, String>> pairList = new ArrayList<>();

        pairList.add(myPair);
        pairList.add(myPair2);
        pairList.add(myPair3);

        for (Pair<?, ?> pair : pairList)
            System.out.println(pair);

    }

    public static class Pair<T, U> {
        T t;
        U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }

        @Override
        public String toString() {
            return "Een paar van '" + t + "' en '" + u + "'";
        }
    }
}
