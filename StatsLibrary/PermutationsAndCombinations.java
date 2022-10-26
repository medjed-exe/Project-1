
/**
 * This class calculates Permutations and Combinations.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class PermutationsAndCombinations
{
       public static void main(String[] args){
           //variables
           int n = 6;
           int r = 4;
           int p = n;
           int cr = r; // r!
           int c;
           
        for (int i = 1; i < r; i++){
            p = p*(n - i);
        }
           System.out.println("permutation: " + p); //prints permutation
        
        for (int j = 1; j < r - 1; j++){
            cr = cr*(r - j);
        }
        c = p/cr;
        System.out.println("combination: " + c); //prints combination
    }
}
