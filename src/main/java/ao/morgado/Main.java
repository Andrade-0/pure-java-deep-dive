package ao.morgado;

import ao.morgado.botstrapper.exception.ApiError;
import ao.morgado.botstrapper.exception.ValidationException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!\n");

        // Exceptions

        Pattern citizenBiPattern = Pattern.compile("^[0-9]{9}[A-Z]{2}[0-9]{3}"); // 008379106LA044

        File file = new File("users_.txt");

//        try {
//            int[] numbers = {1,2,3};
//            System.out.println(numbers[4]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Error: " + e.getMessage());
//        } finally {
//            System.out.println("Bye bye!");
//        }
//
//        int a = 12, b = 0;
//        try{
//            int result = a / b;
//            System.out.println("Result is: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Error: " + e.getMessage());
//        }

//
//        if(citizenBiPattern.matcher(citizenId).matches()) {
//            System.out.println("Citizen Id is correct.");
//        } else {
//            throw new IllegalArgumentException("Citizen Id is incorrect.");
//        }

        String citizenId = "008379106LA04";

        try{
            validationCitizenId(citizenBiPattern, citizenId);
            System.out.println("Citizen id is: " + citizenId);
        } catch (ValidationException e) {
            System.out.println("Invalid CitizenId: " + e.getMessage());
        }
    }

    private static void validationCitizenId(Pattern pattern, String citizenId) {
        if(!pattern.matcher(citizenId).matches()) {
            throw new ValidationException("citizenID", "Invalid CitizenID!");
        }
    }
}