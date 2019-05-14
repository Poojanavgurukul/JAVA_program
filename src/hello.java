import java.util.*;
public class hello {

    public static void main(String[] args) {
        int first=0;
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
        }
    }

}