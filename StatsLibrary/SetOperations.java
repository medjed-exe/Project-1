import java.util.Arrays;
/**
 * This class calculates the union, intersection, and complement of 2 subsets.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class SetOperations
{
   public static void main(String[] args){
       //variables
       int[] subset1 = {1, 3, 6, 7, 8, 2}; //Array 1
       int[] subset2 = {7, 8, 12, 4, 2, 6}; //Array 2
       int length = subset1.length; //This finds the length of Array 1
       int length2 = subset2.length; //This finds the length of Array 2
       int[] sortedArray = subset1; //initializes sorted Array 1
       int[] sortedArray2 = subset2; //initializes sorted Array 2
       Arrays.sort(sortedArray); //This sorts Array 1
       Arrays.sort(sortedArray2); //This sorts Array 2
       int intersecCounter = 0; //number of intersections
       int prevIntersecCounter; //previous number of intersections
       int complCounter = 0; //numbers of complements
       
       //Placeholders for pre-made array
       int[] intersec = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
       int[] compl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
       
       //Intersection
       System.out.println("Intersection"); //prints intersection
       for (int i = 0; i < length; i++){ //goes through all of the first set
           prevIntersecCounter = intersecCounter; // checks to see if same number
         for (int j = 0; j < length2; j++){ //compares to all of the second set
             if (sortedArray[i] == sortedArray2[j]){ //if any value in either set is equal
                 intersec[intersecCounter] = sortedArray[i]; //add the identical number to part of a premade array
                 System.out.println(intersec[intersecCounter]); //prints intersection results
                 intersecCounter = intersecCounter + 1; //goes to next slot in the array
             }
       
    }
        //Complement
        if (intersecCounter == prevIntersecCounter){ //if the array slot did not increment, number is not the same
           compl[complCounter] = sortedArray[i]; //add the non-identical number to the array
           complCounter = complCounter + 1;//goes to next slot in the array
    }
}
    System.out.println("Complement"); //prints complement
    for(int k = 0; k < (complCounter + 1); k++){
        System.out.println(compl[k]); //prints complement results
    }
        //Union
    
}
}
