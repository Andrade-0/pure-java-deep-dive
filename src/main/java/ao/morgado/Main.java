package ao.morgado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Switch Statements

        String role = "admin";

        // old syntax
        // String message;
//        switch (role) {
//            case "admin":
//                message = "Youre an Admin!";
//                break;
//            case "manager":
//                message = "Youre a Manager!";
//                break;
//            default:
//                message = "Youre a Guest!";
//        }

        // new syntax added in java 14+
        String message = switch (role) {
            case "admin" -> "Youre an Admin";
            case "manager" -> "Youre a Manager";
            default -> "Youre a Guest";
        };

        System.out.println(message);
    }
}