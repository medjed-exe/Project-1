/**
 * This class will determine the odds of 2 people in the classroom having the same birthday and month.
 *
 * @Bianca Hernandez
 * @version 1.1
 */
public class Person{
    //variables
    int birthday;
    int yearFactorial = 365;
    double answer;
   //constructor
    public Person(int numOfPeople){
        for (int i = 364; i > 0; i--){
            yearFactorial = (yearFactorial * i);
    }
    answer = (1 - (yearFactorial/Math.pow(365, numOfPeople)));
    System.out.println(answer); //prints answer
}
}
