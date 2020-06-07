import com.fizzbuzz.Game;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

class GameTest {

    @Test
    public void shouldReturnNothingIfSizeIs0() {
        Game game = new Game(0);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, game.printFizzBuzz());
    }

    @Test
    public void shouldPrintFizzAtEveryMultipleOf3() {
        Game game = new Game(5);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("5");
        assertEquals(expected, game.printFizzBuzz());
    }
}