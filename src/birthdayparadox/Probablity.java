/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdayparadox;

import java.util.HashSet;
import java.util.Random;

/**
 * This class contains the assign and calculate probability methods
 * @author Nishanka
 * @version 1.0
 * @since 2015-11-14
 */
public class Probablity {
    
    public static Random randomGenerator = new Random();
    public static int TRIALS = 5000; // Maximum number of trials to assign random numbers
    public static int NUMBER_OF_PEOPLE = 50; //Number of people to simulate for
    
    /**
     *Method to assign random numbers for birthdays of 50 people in a room
     */
    public void assign(){
        
    int counter = 0;
        double probablity = 0.0;
        HashSet<Integer> birthdays = new HashSet<>();
        for (int n = 2; n <= NUMBER_OF_PEOPLE; n++) {
            counter = 0;
            for (int i = 1; i <= TRIALS; i++) {

                int randomNumber = 0;

                for (int j = 0; j < n; j++) {
                    randomNumber = randomGenerator.nextInt(364) + 1;
                    if (birthdays.contains(randomNumber)) {
                        counter++;
                        break;

                    } else {
                        birthdays.add(randomNumber);
                    

                }
                birthdays.clear(); //clear the Hashset
}
            }

            probablity = calcProbability(counter, 5000);

            System.out.println("For " + n + " people,  ");
            System.out.println("Probability = " + probablity);
        }
    }
/**
 * Method to calculate probability of two people sharing their birthdays
 * @param counter parameter to pass the value of counter after a certain number of trials
 * @param trials parameter to pass the maximum trials
 * @return returns the probability of two people having the same birthday
 */

    private static double calcProbability(int counter, int trials) {

        double probability = (double) counter / (double) trials;
        return probability;
    }

}
