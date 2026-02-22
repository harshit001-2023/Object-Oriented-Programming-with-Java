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
    IO.println("Original List : "+list);
    Stream<Integer> stream = list.stream();
    IO.println(convertListToArrayList(list, stream));
    IO.println("---------------------------");
    Stream<Integer> stream1 = list.stream();
    IO.println(retreiveElementfromArrayList(list, stream1));


}

public static List<Integer> convertListToArrayList(List<Integer> list, Stream<Integer> stream) {
    List<Integer> list1 = stream.filter(i -> i > 5).toList();
    return list1;
}

public static Integer retreiveElementfromArrayList(List<Integer> list, Stream<Integer> stream) {
    Integer[] array = stream.filter(e -> e < 5).toArray(Integer[]::new);
    for(Integer i : array){
        return i;
    }
    return null;
}