package Array;

public class ContainerWIthMostWater {

    static int maxArea(int[] height){
        //we will have two pointers to point the too heights of the array
        //one we will point to the first element , second one to the last element
        //we will have a variable for holding the area of water
        //at each step we will calculate the area of water that is held in a region
        //the area will be calculated based on the distance between the 2 points , that will simply be j-i multiplied with the lower height
        //for example [3,4,1,7]
        //initially i is at 3 and j is at 7 , distance between heights is (length-1) - 0 , that is nothing but j - i ==> 3
        //lower height will be the max height of water the water can reach , so that wil be min(3,7) => 3
        //now the area is 3X3 => 9 , we got our first area now

        //now we will move from the tower that is lower in height , because we are taking the min(arr[i],arr[j]) , so the greater value will give greater result , so move towards the center from the smaller value

        int i=0; // pointer for start height
        int j=height.length-1; //pointer for last height
        int area=0; //are of water between heights

        //move till they overlap
        while (i<j){

            //base for calculating area
            int distance=j-i;

            //height for calculating area
            int length=Math.min(height[i],height[j]);

            //update area
            int tempArea=distance*length;

            //if this area is bigger than any other area , update the area variable
            if(tempArea>area){
                area=tempArea;
            }

            //move towards the center
            if(height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }

        return area;

    }
    public static void main(String[] args) {
        int[] heights={1,1};
        System.out.println(maxArea(heights));
    }
}
