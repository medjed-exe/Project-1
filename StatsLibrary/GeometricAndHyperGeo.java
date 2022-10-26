
/**
 * This class calculates Geometric and Hypergeometric distributions.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class GeometricAndHyperGeo
{
     public static void main(String[] args){
        //variables
        int n = 6;
        double prob = 0.4;
        double q = 1 - prob;
        double geometricOnBefore;
        double geometricBefore;
        double geometricOnAfter;
        double geometricAfter;
        double geometricOn;
        
        // Geometric
        geometricOnBefore = (1 - (Math.pow((1 - prob), n)));
        System.out.println("On or Before n Trials: " + geometricOnBefore); //prints combination
        geometricBefore = (1 - (Math.pow((1 - prob), (n - 1))));
        System.out.println("Before n Trials: " + geometricBefore); //prints combination
        geometricOnAfter = (Math.pow((1 - prob), (n - 1)));
        System.out.println("On or After n Trials: " + geometricOnAfter); //prints combination
        geometricAfter = (Math.pow((1 - prob), n));
        System.out.println("After n Trials: " + geometricAfter); //prints combination
        geometricOn = (geometricOnAfter - geometricAfter);
        System.out.println("On n Trials: " + geometricOn); //prints combination
        
        // HyperGeometric
        }
}
