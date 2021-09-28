package ex25;

import java.util.*;

class ex25 {
    public static int passwordValidator(String word) {
        int veryWeak, weak, strong, veryStrong;
        int letter = 0, number = 0, special = 0;
        char[] password = word.toCharArray();
        StringBuilder temp = new StringBuilder();
        //This is to check if there is just integers

        for (char i : password) {
            if (Character.isDigit(i)) {
                number++;
            } else if (Character.isLetter(i)) {
                letter++;
            } else {
                if (!Character.isLetter(i) && !Character.isDigit(i)) {
                    special++;
                }
            }
        }

        if (number > 0 && letter > 0 && special > 0) {
            veryStrong = 3; //if there is numbers letters and special then very strong
            return veryStrong;
        } else if (number > 0 && letter > 0 && special == 0) {
            strong = 2; //if there is number and letters
            return strong;
        } else if (letter > 0 && number == 0 && special == 0) {
            weak = 1;   //if there is just letters
            return weak;
        } else if (number > 0 && letter == 0 && special == 0) {
            veryWeak = 0;   //if there is only numbers
            return veryWeak;
        }
        return 5;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your password?: ");
        String userPassword = input.nextLine();
        String passwordStrength;
        int strength = passwordValidator(userPassword); //connects the switch case to the passwordvalidator

        switch(strength){   //switch cases checks if it is 1,2,3,or 0 and then compares to the strength of the password
            case 0: passwordStrength = "very weak";
                break;
            case 1: passwordStrength = "weak";
                break;
            case 2: passwordStrength = "strong";
                break;
            case 3: passwordStrength = "very strong";
                break;
            default: passwordStrength = "Can not use this password";
        }
        System.out.println("The password '"+userPassword+"' is a "+passwordStrength+" password");
    }
}