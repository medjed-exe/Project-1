
/**
 * This class calculates the Binomial Distribution.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class BinomialDistribution
{
    public static void main(String[] args){
        //variables
        int n = 6;
        int y = 4;
        double prob = 0.4;
        double q = 1 - prob;
        double Binomial;
           
        int p = n;
        int cr = y; // r!
        int c;
           
        for (int i = 1; i < y; i++){  //calculates combination
            p = p*(n - i);
        }
           
        
        for (int j = 1; j < y - 1; j++){  //calculates combination
            cr = cr*(y - j);
        }
           c = p/cr;
              
        Binomial = c*(Math.pow(prob, y))*(Math.pow(q, (n - y))); //calculates binomial distribution
        System.out.println("Binomial: " + Binomial); //prints Binomial
            
    
}
}
