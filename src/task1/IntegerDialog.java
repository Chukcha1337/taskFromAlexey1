package task1;

import java.util.List;
import java.util.Scanner;

public class IntegerDialog implements Dialog {
    private final String tittle;
    private final String failMessage;
    private final List<Integer> keys;
    private final Scanner scanner = new Scanner(System.in);

    public IntegerDialog(String tittle, String failMessage, List<Integer> keys) {
        this.tittle = tittle;
        this.failMessage = failMessage;
        this.keys = keys;
    }

    @Override
    public Integer input() {
        while (true) {
            System.out.println(tittle);
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                for (Integer key : keys) {
                    if (choice == key) {
                        return choice;
                    }
                }
            } catch (NumberFormatException e) {}
            System.out.println(failMessage);
        }
    }
}
