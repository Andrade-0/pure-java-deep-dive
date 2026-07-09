package ao.morgado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Pattern Matching

        final Pattern ACCOUNT_ID_PATTERN = Pattern.compile("^[0-9]{9,14}$");
        final Pattern NIF_PATTERN = Pattern.compile("^[0-9]{9}[A-Z]{2}[0-9]{3}$");

        String nif = "007419385LA023";

        boolean valid = NIF_PATTERN.matcher(nif).matches();

        System.out.println("NIF: "+valid);

        System.out.println(ACCOUNT_ID_PATTERN.matcher("123456789").matches());

        String sonnet = "From fairest creatures we desire increase,\n" +
                "That thereby beauty's rose might never die,\n" +
                "But as the riper should by time decease\n" +
                "His tender heir might bear his memory:\n" +
                "But thou, contracted to thine own bright eyes,\n" +
                "Feed'st thy light's flame with self-substantial fuel,\n" +
                "Making a famine where abundance lies,\n" +
                "Thyself thy foe, to thy sweet self too cruel.\n" +
                "Thou that art now the world's fresh ornament,\n" +
                "And only herald to the gaudy spring,\n" +
                "Within thine own bud flame buriest thy content,\n" +
                "And, tender churl, mak'st waste in niggardly.\n" +
                "Pity the world, or else this glutton be,\n" +
                "To eat the world's due, by the grave and thee.";

        Pattern pattern = Pattern.compile("\\bflame\\b"); // With \b, it only finds the word "flame" in isolation.
        Matcher matcher = pattern.matcher(sonnet); // The Matcher is the object that traverses the text.
        while (matcher.find()) { // matcher.find() : returns true if found
            String group = matcher.group(); // returns the text that matched
            int start = matcher.start(); // returns index where the match starts
            int end = matcher.end(); // returns index where the match ends
            System.out.println(matcher.group() + " " + start + " " + end);
        }
    }
}