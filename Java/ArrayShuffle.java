import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {

  public static void shuffle(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
           
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffle(arr);
        
        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }

    
}
