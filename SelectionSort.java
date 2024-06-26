import java.util.*;
public class SelectionSort{
    static void selection_sort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            // swap
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }

        System.out.println("after selection sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,1,3,5,7,2,9,4};
        int n=arr.length;
        System.out.println("before sorting");
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        selection_sort(arr,n);
    }
}
