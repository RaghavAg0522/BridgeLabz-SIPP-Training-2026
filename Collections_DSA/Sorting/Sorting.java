package Sorting;

public class Sorting{
public static void countingSort(int[] arr) {

    int n = arr.length;
    if (n == 0) return;

    int max = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    int[] count = new int[max + 1];
    int[] output = new int[n];

    for (int i = 0; i < n; i++) {
        count[arr[i]]++;
    }

    for (int i = 1; i <= max; i++) {
        count[i] += count[i - 1];
    }
    for (int i = n - 1; i >= 0; i--) {
        output[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }

    for (int i = 0; i < n; i++) {
        arr[i] = output[i];
    }

}
public static void main(String[] args){
    int[] arr ={4,3,5,2,4,7,1,3};
    countingSort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }   

}

}

 


