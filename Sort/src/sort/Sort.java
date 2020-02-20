package sort;

import java.util.*;
public class Sort {
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        buildHeap(arr);
        int len = arr.length;
        while (len > 1) {
            swap(arr, 0, len - 1);
            len--;
            heapfy(arr, 0 , len);
 
            print(arr);
        }
    }
 
    private static void buildHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2 - 1; i >= 0; i--) {
            heapfy(arr, i, arr.length);
        }
    }
 
    private static void heapfy(int[] arr, int i, int len) {
        while (true) {
            int maxPostion = i;
            int leftChild = 2 * i + 1;  
            int rightChild = 2 * i + 2; 
 
            if (leftChild < len && arr[leftChild] > arr[maxPostion]) {
                maxPostion = leftChild;
            }
 
            if (rightChild < len && arr[rightChild] > arr[maxPostion]) {
                maxPostion = rightChild;
            }
 
            if (maxPostion == i) {
                break;  
            } else {
                swap(arr, i, maxPostion);  
                i = maxPostion;
            }
        }
    }
 
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
 
    public static void main(String[] args) {
       System.out.println("Please enter the array length:");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        System.out.println("Please enter the array,please divide by spaces:");
       
        int[]arr=new int[arrayLength];
        for(int i=0;i<arr.length;i++){
        arr[i]=scanner.nextInt();
        }
        
 
        System.out.print("Before Ordering:  ");
        print(arr);
 
        heapSort(arr);
 
        System.out.print("After Ordering:  ");
        print(arr);
    }
 
    public static void print(int[] arr) {
        if (arr == null)    return;
 
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
