package ao.morgado;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello World, I´m doing a review of Java fundamentals! \n");

        String message = "Give me six hours to \"chop\" down a tree and I will \"spend\" the first four hours \"sharpening\" the axe";

        System.out.println(message);

        // escapes sequence:
        // \n - to new line || \t - to tabulation || \\ - to show one backslash, eg; c:\Windows\...
        // \u - to use unicode || \f - to show next page in the terminal

        // An escape sequence in Java is a sequence of characters that transforms
        // into a special character when compiled, always starting with a backslash (\)
        // followed by a letter or a combination of digits
    }
}