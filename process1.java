
public class process1 {

    public static final String RESET = "\033[0m"; // Reset to default color
    public static final String GREEN = "\033[0;32m"; // Green
    public static final String ORANGE = "\033[38;2;255;165;0m";

    public static void main(String[] args) {
        String title = "                  WELCOME TO BOB                   ";
        int borderLength = title.length() + 4; // Length of border

        // Create border lines with stars and color
        String border = GREEN + "*".repeat(borderLength) + RESET;
        String headingLine = GREEN + "*" + RESET + ORANGE + " " + title + " " + RESET + GREEN + "*" + RESET;

        // Print the heading with colorful design
        System.out.println(border);
        System.out.println(headingLine);
        System.out.println(border);

        //WE CREATE CLASS FOR LANGUAGE AND CALL METHOD FOR LANHUAGE
        ATMlan lang = new ATMlan();
        lang.language();

    }
}
