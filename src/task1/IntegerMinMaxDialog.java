package task1;

import java.util.Scanner;

public class IntegerMinMaxDialog implements Dialog {
    private final String tittle;
    private final String failMessage;
    private final int minimum;
    private final int maximum;
    private final Scanner scanner = new Scanner(System.in);

    public IntegerMinMaxDialog(String input, String failMessage, int minimum, int maximum) {
        this.tittle = input;
        this.failMessage = failMessage;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @Override
    public Integer input() {
        while (true) {
            System.out.println(tittle);
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= minimum && choice <= maximum) {
                    return choice;
                }
            } catch (NumberFormatException e) {}
            System.out.println(failMessage);
        }
    }
}
