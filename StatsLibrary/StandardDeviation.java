
/**
 * This class calculates the Standard Deviation.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class StandardDeviation
{
     public static void main(String[] args){
        
   // Numbers
       int[] numbers = {2, 3, 6, 7, 8, 2}; // original array of numbers you manually put in values for.
   
   // Variables
       int length = numbers.length;
       double total = 0;
       double mean;        
       double varianceTotal = 0;
       double varianceNumber;
       double variance;
       double n = length;
       double std;
       
    // Mean
       for (int i = 0; i < length; i++){ //uses increments to go down the line of the array
        total = total + numbers[i]; //adds up all the numbers in the array
    }
    mean = total/length; //divides sum of numbers over length
        
    // Variance    
       for (int j = 0; j < length; j++){
        varianceNumber = Math.pow((double)(numbers[j] - mean), 2); //square of mean minus the array value
        varianceTotal = varianceTotal + varianceNumber; //sum of all of the values
    
    }
    variance = varianceTotal/(n-1); //variance calculation

    std = Math.sqrt(variance); //sqaure root of variance = std
    System.out.println("standard deviation: " + std); //prints standard deviation
}
}
