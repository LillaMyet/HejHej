package countWords;

import java.util.Scanner;

public class CountWordsMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ord: ");
        String words = scan.nextLine();

        CountWords myRows = new CountWords();
        myRows.stoped(words);

        while(!myRows.isStoped()) {

            myRows.addRows();

            myRows.countCharacters(words);

            words = scan.nextLine();

            myRows.stoped(words);

        }
        System.out.println("Antal rader");
        System.out.println(myRows.getRows());
        System.out.println("Antalet tecken");
        System.out.println(myRows.getCharacters());
    }
}

