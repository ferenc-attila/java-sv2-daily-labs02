package day02;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name:");
        String inputName = scanner.nextLine();

        Terminator terminator = new Terminator("Arnold", 12);

        System.out.println(terminator.greetingSomebody(inputName));
    }
}
