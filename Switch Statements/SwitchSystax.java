
public class SwitchSystax {
    public static void main(String[] args) {
        int variable = 1;
        switch (variable) {
            case 1:
                // code
                break;
            case 2:
                // code
                break;
            default:
                // code
        }
        String day = "MON";
        String result = switch (day) {
            case "MON", "TUE" -> "Weekday";
            case "SAT", "SUN" -> "Weekend";
            default -> "Invalid";
        };
    }
}
