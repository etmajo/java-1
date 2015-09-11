
import skilstak.c;
import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        System.out.println(c.clear + c.y + "Hi, whats your name " + c.x);
        System.out.print("--> " + c.m);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(c.b + "Hi " + name + c.r + " Nice to meet you " + c.x);
    }
}

