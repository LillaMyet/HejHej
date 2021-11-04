package countWords;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CountWordTest {


   @Test
    public void testCountWordGetRows() {
        //Arrange
        CountWords myRows = new CountWords();

        //Act

        int rows = myRows.getRows();

        //Assert
        int expected = 0;
        assertEquals(expected, rows);

    }


    @Test
    public void testCountWordAddRows() {
        //Arrange
        CountWords myRows = new CountWords();

        //Act
        myRows.addRows();
        int rows = myRows.getRows();

        //Assert
        int expected = 1;
        assertEquals(expected, rows);

    }

    @Test
    public void testCountWordGetCharacter() {

        //Arrange
        CountWords myCharacter = new CountWords();

        //Act
        int characters = myCharacter.getCharacters();


        //Assert
        int expected = 0;
        assertEquals(expected, characters);

    }

    @Test
    public void testCountWordCountCharacter() {

        //Arrange
        CountWords myCharacter = new CountWords();

        //Act
        myCharacter.countCharacters("suck");
        int characters = myCharacter.getCharacters();


        //Assert
        int expected = 4;
        assertEquals(expected, characters);

    }


    @Test
    public void testCountWordStop() {
        String ord = "stop";
        //Arrange
        CountWords myStop = new CountWords();
        myStop.stoped(ord);
        //Act
        boolean stop = myStop.isStoped();

        //Assert
        Boolean expected = true;

        assertEquals(expected, stop);

    }

    @Test
    public void testCountWordNotStop() {

        String ord = "hej";
        //Arrange
        CountWords myStop = new CountWords();
        myStop.stoped(ord);
        //Act
        boolean stop = myStop.isStoped();

        //Assert
        Boolean expected = false;

        assertEquals(expected, stop);

    }
}
