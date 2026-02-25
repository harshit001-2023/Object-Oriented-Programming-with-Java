package Arrays;

import java.util.Arrays;
import java.util.Optional;

public class ArrayExample {
    static void main() {
        int[] arr = null;
        try {
//            int len = Integer.parseInt(IO.readln("Enter array size : "));
//            arr = new int[len];
//            IO.println("Please enter the elements of the array: ");
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = Integer.parseInt(IO.readln("Index " + (i + 1) + " : "));
//            }
//
//            IO.println("Original Array: " + Arrays.toString(arr));

            IO.println(testArrays());


//            IO.println("Modify Array: "+ Arrays.toString(arrayElementModification(arr)));
//            IO.println("----------------------------------------------------------------");
//            IO.println("Sorted Array: "+Arrays.toString(sortArray(arr)));
//            IO.println("----------------------------------------------------------------");
//            IO.println("Searched Element : "+searchElement(arr));
//            IO.println("----------------------------------------------------------------");
//            IO.println("Duplicate elements : "+Arrays.toString(findAllDuplicates(arr)));
//            IO.println("----------------------------------------------------------------");
//            IO.println("Insertion Elements in the array: "+ Arrays.toString(insertElementToLastPosition(arr)));
//            IO.println("----------------------------------------------------------------");
//            IO.println("Element Insertion at Middle Position : "+Arrays.toString(insertElementTOMiddlePosition(arr)));
//            IO.println("----------------------------------------------------------------");
//            IO.println("Duplicate Elements removed from array: "+Arrays.toString(removeDuplicateFromArray(arr)));
//            IO.println("Merged Array: "+Arrays.toString(mergeArrays(arr)));
//            IO.println(Arrays.toString(uniqueElement(arr)));
//            IO.println(secondLargest(arr));


        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Please Enter an integer! Only Integers are allowed.");
            System.exit(0);
        }


    }

    public static String testArrays() {
        // Test cases
        int[][] testArrays = {
                {1, 2, 3, 4, 5},      // true
                {5, 5, 5, 5},         // true
                {1, 3, 2, 4},         // false
                {10, 8, 6},           // false
                {},                    // true
                {42},                  // true
                {50, 20, 30, 10}
        };

        for (int[] array : testArrays) {
//            return Arrays.toString(array) + " -> " + isArrayIncreasingOrder(array);
            return Arrays.toString(array) + " -> " + searchElement(array);
        }

        return null;
    }

    // Q1) WAP to modify the value of an array.[Change Array Element]
    public static int[] arrayElementModification(int[] arr) {
        int element = Integer.parseInt(IO.readln("\nEnter which element to modify : "));
        int elementToModify = Integer.parseInt(IO.readln("\nEnter element to modify : "));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = elementToModify;
            }
        }
        return arr;
    }

    // Q2) How to sort Array elements using nested for loop.
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

//        Arrays.sort(arr);
        return arr;
    }

    // Q3) WAP to search an element in the existing array.
    public static int searchElement(int[] arr) {
        int elementTOSearch = Integer.parseInt(IO.readln("Enter element to be searched : "));
        for (int i = 0; i < arr.length; i++) {
            if (i == elementTOSearch) {
                return i;
            }
        }
        return -1;
    }

    // Q4) Find the duplicate elements in the Array and print the duplicate.
    public static int[] findAllDuplicates(int[] arr) {
        // First pass: count duplicates to determine array size
        int duplicateCount = 0;
        boolean[] counted = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (counted[i]) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateCount++;
                    counted[i] = true;
                    break;
                }
            }
        }

        if (duplicateCount == 0) return new int[0];

        // Second pass: collect duplicates
        int[] duplicates = new int[duplicateCount];
        int index = 0;
        counted = new boolean[arr.length]; // Reset

        for (int i = 0; i < arr.length; i++) {
            if (counted[i]) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !counted[j]) {
                    if (!counted[i]) {
                        duplicates[index++] = arr[i];
                        counted[i] = true;
                    }
                    counted[j] = true;
                }
            }
        }

        return duplicates;
    }

    // Q5) Insert a new element in the array at last position
    public static int[] insertElementToLastPosition(int[] arr) {
        int elementToInsert = Integer.parseInt(IO.readln("Please enter the element to be inserted to the last position : "));
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        // System.arraycopy(arr,0,arr1,0,arr.length);
        arr1[arr.length] = elementToInsert;

        return arr1;
    }

    // Q6) Insert a new element in the array at middle position.
    public static int[] insertElementTOMiddlePosition(int[] arr) {
        int elementToInsert = Integer.parseInt(IO.readln("Please enter the element to be inserted to the middle position : "));
        int[] arr1 = new int[arr.length + 1];
        int mid = arr.length / 2;
        System.arraycopy(arr, 0, arr1, 0, mid);
        arr1[mid] = elementToInsert;
        System.arraycopy(arr, mid, arr1, mid + 1, arr.length - mid);

        return arr1;
    }

    // Q7) WAP to Remove Duplicates from array.
    public static int[] removeDuplicateFromArray(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;

        for (int value : arr) {
            boolean isDuplicate = false;

            // Check if element already exists in temp
            for (int k = 0; k < j; k++) {
                if (value == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j++] = value;
            }
        }

        // Create result array with exact size
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);

        return result;
    }

    // Q8) Program to merge to array elements into a single array.
    public static int[] mergeArrays(int[] arr1) {
        int n = Integer.parseInt(IO.readln("Please enter the number of elements in the new array : "));
        int[] arr2 = new int[n + arr1.length];
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(IO.readln("Index " + (i + 1) + " : "));
        }
        IO.println("2nd Array " + Arrays.toString(arr2));
        // Copy existing array elements into remaining part
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[n + i] = arr1[i];
//        }
        System.arraycopy(arr1, 0, arr2, n, arr1.length);
        return arr2;
    }

//    // Q9)  Finding the unique element in the array.
//    public static int[] uniqueElement(int[] arr){
//    }

    // Q10) Find second-largest element in array
    public static int secondLargest(int[] arr) {
        // For non duplicates element
        Arrays.sort(arr);

        return arr[arr.length - 2];
    }

    public static int secondLargest1(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[1];

    }

    public static int secondLargestBuSorting(int[] arr) {
        Arrays.sort(arr);

        int largest = arr[arr.length - 1];  //largest = 90
        int secondLargest = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest)          //87  != 90
            {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }
    
    public static Optional<Integer> secondLargestUsingStream(int[] arr){
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a,b)-> b.compareTo(a))
                .skip(1)
                .findFirst();
    }

    // 11) Given an array of n integers, return true if the array is sorted in non-decreasing order or else false?
    public static boolean isArrayIncreasingOrder(int[] arr) {
        if(arr.length == 0) return true;
        if(arr.length == 1) return true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1] ){
                return false;
            }
        }
        return true;
    }
}