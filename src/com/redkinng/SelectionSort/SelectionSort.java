package com.redkinng.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {14, -7, -58, 89, 37, 80, 0,90,45,28,53,47,7};

        for(int lastIndexOfUnsortedArray = intArray.length -1; lastIndexOfUnsortedArray > 0; lastIndexOfUnsortedArray--){
            int largest = 0;
            for(int i = 1; i<= lastIndexOfUnsortedArray; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                };
            }

            swap(intArray, largest, lastIndexOfUnsortedArray);
        }



        for (int i: intArray) {
            System.out.println(i);
        }


    }

    public static void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
