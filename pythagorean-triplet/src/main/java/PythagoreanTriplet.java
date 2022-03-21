import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet other = (PythagoreanTriplet) o;
        return a == other.a &&
               b == other.b &&
               c == other.c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    static class PythagoreanTripletBuilder {
        private int factorsLessThanOrEqualTo;
        private int sumTo;
        PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int value) {
            factorsLessThanOrEqualTo = value;
            return this;
        }
        PythagoreanTripletBuilder thatSumTo(int value) {
            sumTo = value;
            return this;
        }
        List<PythagoreanTriplet> build() {
            // 9000ms
//            return IntStream.rangeClosed(1, factorsLessThanOrEqualTo / 2)
//                            .boxed()
//                            .flatMap(a -> IntStream.rangeClosed(a + 1, (factorsLessThanOrEqualTo - a) / 2)
//                                                   .filter(b -> b != a)
//                                                   .boxed()
//                                                   .flatMap(b -> IntStream.of(sumTo - (a + b))
//                                                                          .filter(c -> c != b)
//                                                                          .filter(c -> a * a + b * b == c * c)
//                                                                          .mapToObj(c -> new PythagoreanTriplet(a, b, c))
//                                                   )
//                            )
//                            .collect(Collectors.toList());
            // 200ms
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a <= factorsLessThanOrEqualTo / 2; a++)
                for (int b = a + 1; b <= (factorsLessThanOrEqualTo - a) / 2; b++)
                    if (b != a) {
                        int c = sumTo - (a + b);
                        if (c != b)
                            if (a * a + b * b == c * c)
                                triplets.add(new PythagoreanTriplet(a, b, c));
                    }
            return triplets;
        }
    }
}
