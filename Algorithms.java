import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithms {
    private File file;

    // Constructor to initialize the file
    public Algorithms(File file) {
        this.file = file;
    }

    public int odds() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int odds = 0;
        while (s.hasNextInt()) {
            if (s.nextInt() % 2 != 0) {
                odds++;
            }
        }
        return odds;
    }

    public int evens() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int evens = 0;
        while (s.hasNextInt()) {
            if (s.nextInt() % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    public int digits() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int digits = 0;
        while (s.hasNextInt()) {
            if (s.nextInt() >= 10) {
                digits++;
            }
        }
        return digits;
    }

    public int fiveHundred() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int count = 0;
        while (s.hasNextInt()) {
            if (s.nextInt() > 500) {
                count++;
            }
        }
        return count;
    }

    public int greatest() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int greatest = Integer.MIN_VALUE;
        while (s.hasNextInt()) {
            int current = s.nextInt();
            if (current > greatest) {
                greatest = current;
            }
        }
        return greatest;
    }

    public int least() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int least = Integer.MAX_VALUE;
        while (s.hasNextInt()) {
            int current = s.nextInt();
            if (current < least) {
                least = current;
            }
        }
        return least;
    }

    public int sum() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int sum = 0;
        while (s.hasNextInt()) {
            sum += s.nextInt();
        }
        return sum;
    }

    public double mean() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        double sum = 0;
        double count = 0;
        double avg = 0;
        while (s.hasNextInt()) {
            sum += s.nextInt();
            count++;
        }
        avg = sum / count;
        return avg;
    }

    public int mode() throws FileNotFoundException{
        Scanner s = new Scanner(file);{
            int[] nums = new int[9999];
            while (s.hasNextInt()) {
                nums[s.nextInt()]++;
            }
            
            int max = nums[0];
            int mode = 0;
            int i = 1;
            while (i < nums.length) {
                if (nums[i] > max) {
                    mode = i;
                    max = nums[i];
                }
                i++;
            }
            
            return mode;
        }
    }
}
