import java.util.Scanner;
public class validatePassword {

    public static void validatePassword(String pass) {
        String rules = "";
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digits = false;
        boolean spl = false;
        if (pass.length() < 8) {
            rules += "The password must be at least 8 characters long.\n";
        }
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 65 && pass.charAt(i) <= 90)
            upperCase = true;
            if (pass.charAt(i) >= 97 && pass.charAt(i) <= 122)
            lowerCase = true;
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57)
            digits = true;
            if(pass.charAt(i)>= 33 && pass.charAt(i) <= 47)
            spl = true;
        }

        if (!upperCase)
            rules += "The password must contain at least one uppercase letter (A-Z).\n";
        if (!lowerCase)
            rules += "The password must contain at least one lowercase letter (a-z).\n";
        if (!digits)
            rules += "The password must contain at least one digit (0-9).\n";
        if(!spl)
            rules += "The password must contain at least one Special Character.\n";

        if (rules.equals(""))
            rules = "Your password is valid.";
        else
            rules = "Your password is invalid.\n" + rules;
        System.out.print(rules);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        validatePassword(password);
    }

}