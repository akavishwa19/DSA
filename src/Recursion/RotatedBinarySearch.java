package Recursion;

public class RotatedBinarySearch {

    //rotated array in a binary search problem consists of a sorted array that is rotated to n places
    //it has a pivot , basically the point from which array starts to misbehave
    //the pivot can be considered as the largest number in the array

    //one approach to solve the problem could be first to find the pivot , since we found he pivot we now have two sorted arrays
    //apply binary search in the arrays and get the solution

    //how do i find the pivot?
    //if the array is an ascending one , the only point it starts o descend is when the pivot ends
    //eg: [2,3,4,5,0,1] , in this , [2,3,4,5] ascends and then [0,1] ascends , it only descends at [5,0]

    //so we can have the pivot if ,
    // CASE 1: the mid element is greater then mid+1 ==> arr[mid]>arr[mid+1]  , arr[mid] is the pivot
    // CASE 2:the mid element is greater than mid-1 ==> arr[mid]<arr[mid-1]  , arr[mid-1] is the pivot
    // CASE 3:if start element is greater than mid element ==> all the elements after mid will be smaller than start
    //eg: [7,8,0,1,2,3,4,5,6] , s=7 , e=6 , m= 2 , so all the elements after 2 are definitely smaller than start that is 7 , hence we can ignore all these elements since we are looking for peak
    //we can ignore by searching in the left array that is by moving end to mid-1

    // CASE 4:another case is where start elements is smaller than middle element , then it lies in the right part , therefore move start to mid+1

    //all this logic was just to find the pivot , so lets code now
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        //find until start overlaps end
        while (start<=end){

            //calculate mid point
            int mid=start+(end-start)/2;

            //first case
            //if the array descends after the mid point , mid is the pivot
            if( mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            //second case
            //if the arrays descends before the mid point , mid-1 is the pivot
            if( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            //case 3
            //if my start element is greater than the mid element , i need to look for the pivot in left part as all the right side of pivot is not bigger than start
            if(  arr[start]>=arr[mid]){
                //search in left
                end=mid-1;
            }

            //last case
            else{
                start=mid+1;
            }

        }

        return -1;

    }

    //regular binary search
    static int binary_search(int[] arr , int start , int end , int target){
        while (start<=end){
            int mid=start + (end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }

        return -1;
    }

    static int search(int[] arr,int target){

        //fisrt get the pivot element
        int pivot = pivot(arr);

        //initialise start and end
        int start=0;
        int end=arr.length-1;

        //if no pivot is found , that means array is already sorted
        if(pivot==-1){
            return binary_search(arr,start,end,target);
        }

        //if pivot is at the target element , return the pivot itself
        if(arr[pivot]==target){
            return pivot;
        }

        //if the target element is greater than the start element , this means , there is no chance for it to ne in the other sorted array as all its  elements will definitely be smaller than start
        //so we reduce the search space inside the first half
        if(target>= arr[start]){
            return binary_search(arr,start,pivot-1,target);
        }

        //otherwise its in the other sorted array
        else{
            return binary_search(arr,pivot+1,end,target);
        }

    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,7));
    }

}
