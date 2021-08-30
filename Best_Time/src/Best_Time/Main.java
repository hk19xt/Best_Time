package Best_Time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*Author: Hyejin Kim
Date: 8/29/2021*/

//This class is main class.

public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader streamReader = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(streamReader);

        System.out.println("Enter the input price values separated by comma ',' ");
        String[] inputs = reader.readLine().split(",");

        reader.close();

        int[] inputs2 = new int[inputs.length];

        for(int i=0; i<inputs.length; i++){
            inputs2[i] = Integer.parseInt(inputs[i]);
        }

        System.out.println("User's input prices: " + Arrays.toString(inputs));
        System.out.println("Profit output: " + Best_Time.bestProfit(inputs2));
    }
}
