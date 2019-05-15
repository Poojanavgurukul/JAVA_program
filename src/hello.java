import java.util.*;
public class hello {

    /*public static void main(String[] args) {
        *//*int first=0;
        Integer arr[]={10,20,30,40,50};
        int key=Integer.parseInt(args[0]);
        int last=arr.length-1;
        int mid=(first+last)/2;
        while (first<=last){
            if (arr[mid]<key){
                first=mid+1;
            }else if(arr[mid]==key){
                System.out.println(mid);
                break;
            }
            else {
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if (first>last){
            System.out.println("no Element");
        }*//*

    }
*/
    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key);//search in left subarray
            }else{
                return binarySearch(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = Integer.parseInt(args[0]);
        int last=arr.length-1;
        int result = binarySearch(arr,0,last,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}