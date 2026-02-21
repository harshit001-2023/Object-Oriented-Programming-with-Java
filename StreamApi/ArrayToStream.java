import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

void main() {
    String[] cities = {"Pune", "Hyderabad", "Nagpur", "Mumbai", "Bangalore"};
    Stream<String> stream = Arrays.stream(cities);
    stream.forEach(IO::println);

    IO.println();

    int[] intArr = {10, 20, 30, 40, 50, 60};
    IntStream intStream = Arrays.stream(intArr);
    intStream.forEach(IO::println);

    IO.println();

    long[] longArr = {10L, 20L, 30L, 40L, 50L, 60L};
    LongStream longStream = Arrays.stream(longArr);
    longStream.forEach(IO::println);

    IO.println();
    double[] doubleArr = {10.2, 20D, 30.65, 40D, 50D, 60.02};
    DoubleStream doubleStream = Arrays.stream(doubleArr);
    doubleStream.forEach(IO::println);
}