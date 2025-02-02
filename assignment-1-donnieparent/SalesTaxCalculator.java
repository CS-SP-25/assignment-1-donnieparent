import java.util.Objects;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        // checks there is exactly two arguments
        if (args.length == 2) {
            String state = args[0];
            double value;
            // verifies value is a number
            try {
                value = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid value: " + args[1] + ". Please enter a value number.");
                return;
            }
            // makes state lowercase
            String lowercaseState = state.toLowerCase();
            // if alaska, then instantiate an Alaska State and calculate the tax
            if (Objects.equals(lowercaseState, "alaska")) {
                State.setName("Alaska");
                new Alaska();
                State.showTax(value);
            }
            // if indiana, then instantiate an Indiana State and calculate the tax
            else if (Objects.equals(lowercaseState, "indiana")) {
                State.setName("Indiana");
                new Indiana();
                State.showTax(value);
            }
            // if hawaii, then instantiate a Hawaii State and calculate the tax
            else if (Objects.equals(lowercaseState, "hawaii")) {
                State.setName("Hawaii");
                new Hawaii();
                State.showTax(value);
            }
            // if not alaska or indiana or hawaii, prompt user to retry with either Alaska or Indiana
            else {
                System.out.println("Invalid state: " + state + ". Please choose either Indiana or Alaska.");
                return;
            }
        }
    }
}
