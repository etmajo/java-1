
import skilstak.c;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;  

public final class eightball {
    private static List<String> answers = Arrays.asList("yes.","No.","Maybe","Defintly","ask again","defintly...........not","Don't ask again","Can't tell u","bagles");
    /**
     * promt for input
     */
    private final static String input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String answer = scanner.nextLine();
        //TODO get answer
        return answer;
    }

    private final static String choise(List list) {
        //TODO gat a random number between 0 and the last list index
        int index = ThreadLocalRandom
                .current()
                .nextInt(list.size());
        return (String) list.get(index);
    }

    public static final void main(String[] args) {
        System.out.println(c.cl + c.y + "\nWelcome to the Magic Eightball!\n"
        + "Enter your question below:\n\n" + c.x);
        while (true) {
        String question = input(c.b3 + "--> " + c.b3);
        String answer = choise(answers);
        System.out.println(c.random() + answer + c.x);
        }
    }
}
