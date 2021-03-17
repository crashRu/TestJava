
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        String userInput;
        Scanner scanner = new Scanner(System.in);

        userInput = scanner.nextLine();
        char[] result;
        if (userInput != null && userInput.length() > 0) {
            userInput = userInput.replaceAll(" ", "");
            result = userInput.toCharArray();

        } else {
            throw new IllegalAccessException("Введена пустая строка ((");
        }
        int oldCount = 0;
        int count = 0;
        char temp = 1;

        for (int i = 0; i < result.length; i++) {
            if (count >= oldCount) {
                oldCount = count;
                temp = result[i];
                count = 0;
            }
            for (int j = 0; j < result.length; j++) {
                if (result[i] == result[j]) {
                    count++;
                }
            }
        }
        System.out.printf("Буква: %s - число повторений: %d", temp, oldCount);

    }
}
