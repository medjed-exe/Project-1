
/**
 * This class calculated the Poission Distribution.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class PoissionDistribution
{
    public static void main(String[] args){
        //variables
        double lambda = 0.5;
        int y = 4;
        int fy = y;
        double poisson;
        
        for (int i = 1; i < y; i++){
            fy = fy * (i);
        }
        
        poisson = ((Math.pow(lambda, y))/fy) * (Math.exp(-lambda));
        System.out.println(poisson); //prints poisson
        
    }
}
