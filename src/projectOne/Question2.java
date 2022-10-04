package projectOne;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
         * Using Scanner create an array of countries and capitals. When an array is created for countries and capitol,
         * retrieve then ask the user to store countries and their capitals in those arrays then retrieving the countries and its capital and  print them to gether . (use 2 different loops)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter how many countries you want to process");
        int size=scanner.nextInt();
        // Two arrays one to store the counties and the other one to store the capitals
        String [] countries=new String[size];
        String [] capitals=new String[size];

        // This is just to consume that extra enter that we will be getting from line number 18
        scanner.nextLine();

        for(int i=0;i<size;i++) {
            System.out.println("Please Enter the country name");
            countries[i]=scanner.nextLine();

            System.out.println("Please Enter the capital for "+countries[i]);
            capitals[i]=scanner.nextLine();
        }
        //Prints the arrays in a good format
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.toString(capitals));

        for(int i=0;i<size;i++) {

            System.out.println("The Country " + countries[i] + " Has the capital " + capitals[i]);


        }
    }
}
