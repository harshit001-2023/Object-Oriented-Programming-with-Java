import java.util.Arrays;

void main() {
    int[] arr = {10, 15, 20, 25, 30, 35, 40, 35, 10};
    String[] cities = {"Pune", "Hyderabad", "Nagpur", "Mumbai", "Bangalore"};

    IO.println(Arrays.toString(FilterDemo(arr)));
    IO.println(Arrays.toString(cities));
}

// Retrieve all the even number from Array by removing he duplicates and
// provide sorting in ascending order using Stream Api
public static int[] FilterDemo(int[] arr){
    return Arrays.stream(arr)
            .distinct()
                .sorted()
                    .filter(num -> num%2==1)
                        .toArray();
}

// Retrieve cities who starts with 'H'
public static Object[] FilterDemo1(String[] arr){
    return Arrays.stream(arr)
            .filter(city -> city.startsWith("H"))
            .toArray();
}

//Print all he ay elements divisible by 3 and 5
public static int[] FilterDemo2(int[] arr){
    return Arrays.stream(arr)
            .filter(n-> n%3==0 && n%5==0)
            .toArray();
}

// Print all he names whose length is greater than 3 remove duplicates and sort in reverse order
public static Object[] FilterDemo3(String[] names){
    return Arrays.stream(names).distinct().sorted((s1,s2)->s2.compareTo((s1))).filter(name->name.length() >3).toArray();
}

// Filter all the Prime Numbers from the given array
public static int[] FilterDemo4(int[] arr){
    return Arrays.stream(arr).filter(num -> isPrime(num)).toArray();
}

private static boolean isPrime(int n){
    if(n==1) return true;
    if(n==2) return true;
    if(n%2==0) return false;
    for(int i = 3; i*i <= n; i+=2){
        if(n%i==0) return false;
    }
    return true;
}

