package countWords;

import java.util.Scanner;

public class CountWordsMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Skriv in ord: ");

        while(true) {
            String words = scan.nextLine();

            CountWords myRows = new CountWords();
            myRows.addRows();
            int rows = myRows.getRows();

            CountWords myCharacter = new CountWords();
            myCharacter.countCharacters(words);
            int characters = myCharacter.getCharacters();

            CountWords myStop = new CountWords();
            myStop.stoped(words);
            boolean stop = myStop.isStoped();

            if (myStop.isStoped()){
                System.out.println("Antal rader");
                System.out.println(myRows.getRows());
                System.out.println("Antalet tecken");
                System.out.println(myCharacter.getCharacters());
                break;
            }



        }
    }
}

