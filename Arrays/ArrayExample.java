package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample{
    static void main() {
        int[] arr = null;
        try {
            int len = Integer.parseInt(IO.readln("Enter array size : "));
            arr = new int[len];
            IO.println("Please enter the elements of the array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(IO.readln("Index " + (i + 1) + " : "));
            }

            IO.println("Original Array: "+Arrays.toString(arr));

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
            IO.println("Merged Array: "+Arrays.toString(mergeArrays(arr)));


        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Please Enter an integer! Only Integers are allowed.");
            System.exit(0);
        }





    }

    // Q1) WAP to modify the value of an array.[Change Array Element]
    public static int[] arrayElementModification(int[] arr){
        int element = Integer.parseInt(IO.readln("\nEnter which element to modify : "));
        int elementToModify = Integer.parseInt(IO.readln("\nEnter element to modify : "));

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                arr[i] = elementToModify;
            }
        }
        return arr;
    }

    // Q2) How to sort Array elements using nested for loop.
    public static int[] sortArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
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
    public static int searchElement(int[] arr){
        int elementTOSearch = Integer.parseInt(IO.readln("Enter element to be searched : "));
        for(int i  = 0; i < arr.length; i++){
            if(i == elementTOSearch){
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
    public static int[] insertElementToLastPosition(int[] arr){
        int elementToInsert = Integer.parseInt(IO.readln("Please enter the element to be inserted to the last position : "));
        int[] arr1 = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        // System.arraycopy(arr,0,arr1,0,arr.length);
        arr1[arr.length] = elementToInsert;

        return arr1;
    }

    // Q6) Insert a new element in the array at middle position.
    public static int[] insertElementTOMiddlePosition(int[] arr){
        int elementToInsert = Integer.parseInt(IO.readln("Please enter the element to be inserted to the middle position : "));
        int[] arr1 = new int[arr.length+1];
        int mid = arr.length/2;
        System.arraycopy(arr, 0, arr1, 0, mid);
        arr1[mid] = elementToInsert;
        System.arraycopy(arr, mid, arr1, mid+1, arr.length-mid);

        return arr1;
    }

    // Q7) WAP to Remove Duplicates from array.
    public static int[] removeDuplicateFromArray(int[] arr){
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

    // Q2) Program to merge to array elements into a single array.
    public static int[] mergeArrays(int[] arr1){
        int n = Integer.parseInt(IO.readln("Please enter the number of elements in the new array : "));
        int[] arr2 = new int[n+arr1.length];
        for(int i = 0; i < n; i++){
            arr2[i] = Integer.parseInt(IO.readln("Index " + (i + 1) + " : "));
        }
        IO.println("2nd Array "+Arrays.toString(arr2));
        // Copy existing array elements into remaining part
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[n + i] = arr1[i];
//        }
        System.arraycopy(arr1, 0, arr2, n, arr1.length);
        return arr2;
    }

}