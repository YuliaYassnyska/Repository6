package main.java.ua.lviv.iot.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringProcessor {

    public static String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Your text:");
        return br.readLine();
    }

    public static void main(final String... args) {
        try {
            String input = StringProcessor.readInputText();
            Input text = new Input(input);
            text.showResults();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your text:");
        String input = scanner.nextLine();
        Input text = new Input(input);
        text.showResults();
}
}
