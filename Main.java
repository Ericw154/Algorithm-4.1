import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File numbersFile = new File("Numbers.txt");
        Algorithms algorithms = new Algorithms(numbersFile);
        System.out.println("Number of odd numbers: " + algorithms.odds());
        System.out.println("Number of even numbers: " + algorithms.evens());
        System.out.println("Number of numbers with 2 or more digits: " + algorithms.digits());
        System.out.println("Number of numbers greater than 500: " + algorithms.fiveHundred());
        System.out.println("Greatest number in the file: " + algorithms.greatest());
        System.out.println("Least number in the file: " + algorithms.least());
        System.out.println("Sum of numbers: " + algorithms.sum());
        System.out.println("Avg of numbers: " + algorithms.mean());
        System.out.println("Mode of the numbers: " + algorithms.mode());
    }
}
