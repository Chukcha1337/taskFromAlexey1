package task1;

import java.util.List;
import java.util.Scanner;


public class StringDialog implements Dialog {
    private final String input;
    private final String failMessage;
    private final List<String> bannedWords;
    private final Scanner scanner = new Scanner(System.in);

    public StringDialog(String input, List<String> bannedWords, String failMessage) {
        this.input = input;
        this.failMessage = failMessage;
        this.bannedWords = bannedWords;
    }

    @Override
    public String input() {
        OUTER_LOOP:
        while (true) {
            System.out.println(input);
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (bannedWords.contains(word.toLowerCase())) {
                    System.out.println(failMessage);
                    continue OUTER_LOOP;
                }
            }
            return line;
        }
    }
}
