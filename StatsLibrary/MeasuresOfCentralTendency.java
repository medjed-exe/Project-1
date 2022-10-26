import java.util.Arrays;
/**
 * This class calculates the mean, median, and mode.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class MeasuresOfCentralTendency
{
    public static void main(String[] args){
   // Numbers
       int[] numbers = {2, 3, 6, 7, 8, 2}; // original array of numbers you manually put in values for.
   
   // variables
       int length = numbers.length;
       double total = 0;
       double mean;
       double median;
       int medianVariable;
       int medianVariable2;
       double half;
       int[] sortedArray;
       sortedArray = numbers;
       double mode = 0;
   
   // Mean
       for (int i = 0; i < length; i++){ //uses increments to go down the line of the array
        total = total + numbers[i]; //adds up all the numbers in the array
    }
        mean = total/length; //divides sum of numbers over length
        System.out.println("Mean: " + mean); //prints mean
  
   // Median
       Arrays.sort(sortedArray); // sorts array in order of least to greatest using the Array class
       half = length % 2; // gets remainder
       if (half == 1){ // checks if there is an odd number of values in array
           medianVariable = (length / 2); // finds middle number of array
           median = sortedArray[medianVariable]; // sets median to middle number of array
       }
       else {
           medianVariable = ((length / 2) - 1); // finds middle left number
           medianVariable2 = (length / 2); // finds middle right number
           median = ((double)sortedArray[medianVariable] + (double)sortedArray[medianVariable2])/2; // adds double casing and finds the average of the left and right middle numbers
          
       }
       System.out.println("Median: " + median); // prints median
   
   // Mode
       int numberCounter = 0; // number of identical numbers in a row
       int highestCounter = 0; // highest number of identical numbers in a row
       for (int i = 0; i < length - 1; i++){ // goes through the array, added a -1 after length so that it doesn't go out of the bounds of the array
           if (sortedArray[i] == sortedArray[i + 1]){ // checks for identical values
               numberCounter = numberCounter + 1; //if identical, numberCounter goes up by 1
                   if(numberCounter > highestCounter){ // if numberCounter > highestCounter (highest value), then highestCounter would be equal to the numberCounter
                       highestCounter = numberCounter;
                       mode = sortedArray[i]; // mode = number with the most duplicates in the array
                   }
           }
           else{
               numberCounter = 0; //resets numberCounter when the next value in the array is not a duplicate
           }
       }
       System.out.println("Mode: " + mode); // prints mode
}
}
