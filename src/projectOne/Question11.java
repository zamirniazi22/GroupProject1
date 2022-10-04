package projectOne;

public class Question11 {
    public static void main(String[] args) {
       // Write a program to print out duplicate elements from
       // an Array of Strings?
        int[] my_array = {10, 20, 30, 50, 10, 40, 20};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i]==(my_array[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+my_array[j]);
                }
            }
        }


    }
}
