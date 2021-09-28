package ex36;

import java.util.*;

public class ex36 {
        static int[] array(String[] array){

            int[] numbers = new int[array.length];  //

            for(int i = 0; i< array.length; i++){   //finds the length of number entered
                numbers[i] = Integer.parseInt(array[i]);
                System.out.println(numbers[i]);
            }
            return numbers;
        }

        static float average(int[] numbers){
            float total = 0;
            for(int i = 0; i< numbers.length; i++){
                total = total + numbers[i]; //adds numbers together
            }

            float average = total/ numbers.length;  //total divided by the number of numbers entered
            return average;
        }
        static int  Min(int[] numbers){
            int temp = 0;
            int min = 10000;
            for(int i = 1; i< numbers.length; i++){
                temp = numbers[0];
                if(temp > numbers[i])   //looks for if the number is greater than temp
                    temp = numbers[i];
                if(temp<min)    //looks for if temp is less than min and the min is = equal
                    min = temp;
            }
            return min;
        }
        static int Max(int[] numbers){

            int temp = 0;
            int max = 0;
            for(int i = 1; i< numbers.length; i++){
                temp = numbers[0];
                if(temp < numbers[i])   //looks if the temp less than the number
                    temp = numbers[i];
                if(temp>max)    //if the temp is greater than max then max = temp
                    max = temp;
            }
            return max;
        }
        static double std(int[] numbers){
            double sum = 0.0, standardDeviation = 0.0;
            int length = numbers.length;

            for(int i = 0; i< length; i++) {
                sum += numbers[i];  //add numbers
            }

            double mean = sum/length;   //gets the mean by the sum and dividing amount

            for(int i = 0; i< length; i++) {
                standardDeviation += Math.pow(numbers[i] - mean, 2);    //std formula
            }
            return (Math.sqrt(standardDeviation/length));
        }
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter in a number: ");
            String number = input.nextLine();   //store number
            ArrayList<String> list = new ArrayList<>();

            while(!number.equals("Done")){  //once they type "Done" then it stops adding number to the list
                list.add(number);
                System.out.print("Enter in a number: ");
                number = input.nextLine();  //stores number
            }

            String array[] = new String[list.size()];
            for(int j =0;j<list.size();j++) {
                array[j] = list.get(j);
            }

            int[] numbers = array(array);

            float avg = average(numbers);
            int min = Min(numbers);
            int max = Max(numbers);
            double stdDev = std(numbers);

            System.out.print("Average: "+ avg + "\nMinimum: "+ min+ "\nMaximum: "+ max);
            System.out.printf("\nStandard Deviation: %.2f", stdDev);
        }
    }

