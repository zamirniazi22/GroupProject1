package projectOne;

public class Question10 {
    public static void main(String[] args) {
        //Write a java program to find the second largest
        //number in the array?
        int[] nums = { 50, 6, 60, 70, 80, 90, 9, 2, 35,100 };

        int largest = nums[0];
        int secondlargest = nums[0];

       for (int i= 0; i < nums.length; i++) {
           if (nums[i] > largest) {
               secondlargest = largest;
               largest = nums[i];
           }else if(nums[i]>secondlargest){
               secondlargest=nums[i];
           }
       }

        System.out.println("the second largest number is  "+secondlargest);
        }



    }

