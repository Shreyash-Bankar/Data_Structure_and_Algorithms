import java.util.*;
public class SearchInRotatedArray{
    public static int search(int arr[],int si,int ei,int target){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(arr[mid] == target ){
            return mid;
        }

        if(arr[si] <=  arr[mid]){
            if(arr[mid] >= target && target >= arr[si]){
                return search(arr,si,mid-1,target);
            }else{
                return search(arr,mid+1,ei,target);

            }
        }else{
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr,mid+1,ei,target);
            }else{
                return search(arr,si,mid-1,target);

            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        System.out.print(search(arr,0,arr.length-1,0));
    }
}