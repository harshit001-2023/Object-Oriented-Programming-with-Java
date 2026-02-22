import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Write a program to create a stream with the elements of and ArayList and get the element which are greater
// than 5 into stream
void main() {
    List<Integer> list = new ArrayList<Integer>();

    for(int i = 1; i < 10; i++){
        list.add(i);
    }

    IO.println(list);

    Stream<Integer> stream = list.stream();

    List<Integer> list1 = stream.filter(i -> i > 5).collect(Collectors.toList());

    IO.println(list1);
}