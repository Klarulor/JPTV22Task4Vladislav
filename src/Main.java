import java.util.Random;

import static java.lang.Integer.parseInt;

public class Main {
    public static final int LENGTH = 100;
    public static final int COUT_LENGTH = 10;
    public static final int NUMBER_VALUE_LIMIT = 100;
    public static void main(String[] args) {
        int[] arr = new int[LENGTH];
        // generate
        Random rnd = new Random();
        for(int i = 0; i < LENGTH; i++){
            int n = rnd.nextInt(NUMBER_VALUE_LIMIT);
            if((n % 2) == 0)
                n -= 1;
            arr[i] = Math.abs(n);
        }

        // cout
        for(int i = 0; i < COUT_LENGTH; i++){
            for(int j = 0; j < COUT_LENGTH; j++){
                System.out.print(arr[i*COUT_LENGTH+j] + " ");
            }
            System.out.println();
        }

        //sort
        int[] newArr = arr.clone();

        for(int i = 0; i < LENGTH; i++){
            for(int j = 1; j < LENGTH; j++){
                int pE = newArr[j-1];
                int cE = newArr[j];
                if(cE < pE){
                    newArr[j-1] = cE;
                    newArr[j] = pE;
                }
            }
        }

        System.out.print("\n\nNew sorter array:");
        // cout
        for(int i = 0; i < COUT_LENGTH; i++){
            for(int j = 0; j < COUT_LENGTH; j++){
                System.out.print(newArr[i*COUT_LENGTH+j] + " ");
            }
            System.out.println();
        }
    }
}