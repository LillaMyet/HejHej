package countWords;


public class CountWords {
    private int addRows;
    private int countCharacters;
    private boolean isStop;

    public CountWords() {

        isStop = false;
        addRows=0;
        countCharacters=0;
    }

    public int getRows() {

        return addRows;
    }

    public void addRows() {

        addRows = addRows + 1;
    }

    public int getCharacters() {

        return countCharacters;
    }

    public boolean isStoped() {

        return isStop;
    }

    public void countCharacters(String text) {
            countCharacters = countCharacters + text.length();
        }

    public void stoped(String text){
        if (text.equals("stop")) {
            isStop = true;
    }
}}
