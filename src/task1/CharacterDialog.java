package task1;

import java.util.Scanner;

public class CharacterDialog implements Dialog {
    private final String tittle;
    private final String failMessage;
    private final Scanner scanner = new Scanner(System.in);

    public CharacterDialog(String tittle, String failMessage) {
        this.tittle = tittle;
        this.failMessage = failMessage;
    }

    @Override
    public Character input() {
        while (true) {
            System.out.println(tittle);
            String input = scanner.nextLine();
            if (input.matches("[a-zA-Z]")) {
                return input.charAt(0);
            }
            System.out.println(failMessage);
        }
    }
}
