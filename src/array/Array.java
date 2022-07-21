package array;
import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        System.out.println(binarySearch(arr,x));

    }
    public static int linearSearch(int arr[],int x){

        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }

        return -1;
    }

    public  static int binarySearch (int [] arr, int n){
        int start = 0, end =arr.length-1;

        while(start<=end){
            int mid = start - (start -end)/2;
            if(arr[mid]==n){
                return mid;
            }else if(arr[mid]>n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
System.out.print("hello");
        }

        return -1;
    }
}
