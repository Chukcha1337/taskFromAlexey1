package task1;

public class Main {
    public static void main(String[] args) {
        final int number = 3;
        String tittle = String.format("Введите число, для которого необходимо ухнать, больше ли оно чем " +
                "(%d)", number);
        String failMessage = "Ошибка ввода";

        Dialog<Boolean> dialog = new BooleanDialog(number, tittle, failMessage);
        Boolean output = dialog.input();
        System.out.println("Результат сравнения: " + output);


//        КОД ДЛЯ ПРОВЕРКИ StringDialog()
//
//        String bannedWord1 = "плохой";
//        String bannedWord2 = "зло";
//        String bannedWord3 = "ярость";
//
//        List<String> bannedWords = List.of(bannedWord1, bannedWord2, bannedWord3);
//
//        String tittle = String.format("Введите любую строку, не содержащую запрещенных слов " +
//                "(%s, %s, %s)", bannedWord1, bannedWord2, bannedWord3);
//        String failMessage = "В строке есть запрещенные слова";
//
//        Dialog<String> dialog = new StringDialog(tittle, bannedWords,  failMessage);
//        String output = dialog.input();
//        System.out.println("ВВЕДЕНА СТРОКА: " + output);
//
    }
}