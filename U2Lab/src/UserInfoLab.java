import java.util.Scanner;
public class UserInfoLab {
    public static void main(String[] args) {
        // Part 1
        // Create a Scanner for keyboard input
        // Ask the user to enter their first and last name and pass these
        // values to the generateUsername method and save the returned result.

        // Part 2
        // Ask the user to enter a password and pass this value to the validatePassword method.
        // The validatePassword method will check if the password meets the criteria:

        // Part 3
        // If the user entered a valid password in step 2, then ask the user to enter their
        // credit card number and pass this value to the maskCreditCard method.

        // Part 4
        // If the user entered a valid password AND valid credit card number, display the output
        // as shown in the demo video
        // https://drive.google.com/file/d/1sMOw5wkOgSfuUcvQhFyZ5flnv_d9qQd3/view?usp=sharing
        Scanner scan = new Scanner(System.in);
        System.out.println("Type First Name");
        String firstName = scan.nextLine();
        System.out.println("Type Last Name");
        String lastName = scan.nextLine();
        System.out.println("Enter Password");
        String password = scan.nextLine();
    }

    public static String generateUsername(String firstName, String lastName) {
        String userName = "";
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        if (firstName.length() > 4){
            userName += firstName.substring(0,3);
        }
        else{
            userName += firstName;
        }
        if (lastName.length() > 4){
            userName += lastName.substring(0,3);
        }
        else {
            userName += lastName;
        }
        return userName;
    }

    public static boolean validatePassword(String password) {
        if (password.length() >= 8){
            if (containsDigit(password)){
                for (int i = 0; i < password.length(); i++){
                    if (password.substring(i, i + 1).equals(password.substring(i,i + 1).toUpperCase())){
                        return true;
                    }
                    else {
                        System.out.println("Password Must Have At least One Uppercase Letter");
                        return false;
                    }
                }
            }
            else{
                System.out.println("Password Must Contain A Digit");
                return false;
            }
        }
        else{
            System.out.println("Password Must Have At Least 8 Characters");
            return false;
        }
        return false;
    }
    public static String maskCreditCard(String creditCardNumber) {
        // Fill in this method and if the credit card is valid, return a masked CC
        return "";
    }

    /**
     This method verifies that the string contains at least one numeric digit
     @param str The string to check
     @return true or false if a digit is present
     */
    public static boolean containsDigit(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    /**
     * Checks if the entire String is all numerical
     * @param str The string to check
     * @return true or false if the string is ALL digits
     */
    public static boolean allDigits(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

}
