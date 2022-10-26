import java.util.Scanner;
/**
 * This class tests Person class.
 */
public class PersonTester
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // calls into Scanner class
        System.out.print("Input number of people in class: "); //prompt
        int numOfPeople = input.nextInt(); //waits for user input
       
        Person probability = new Person(numOfPeople);
        System.out.print(probability);
        
    }
}
