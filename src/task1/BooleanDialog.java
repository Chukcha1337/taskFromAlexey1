package task1;

import java.util.Scanner;

public class BooleanDialog implements Dialog {
    private final int number;
    private final String tittle;
    private final String failMessage;
    private final Scanner scanner = new Scanner(System.in);

    public BooleanDialog(int number, String tittle, String failMessage) {
        this.number = number;
        this.tittle = tittle;
        this.failMessage = failMessage;
    }

    @Override
    public Boolean input() {
        while (true) {
            System.out.println(tittle);
            try {
                int inputNumber = Integer.parseInt(scanner.nextLine());
                return inputNumber > number;
            } catch (NumberFormatException e) {}
            System.out.println(failMessage);
        }
    }




}
