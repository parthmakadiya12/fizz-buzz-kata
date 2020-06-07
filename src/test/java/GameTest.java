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
        Game game = new Game(6);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        assertEquals(expected, game.printFizzBuzz());
    }

    @Test
    public void shouldPrintBuzzAtEvery5thOccurance() {
        Game game = new Game(12);
        assertEquals("Buzz", game.printFizzBuzz().get(4));
        assertEquals("Buzz", game.printFizzBuzz().get(9));
    }

    @Test
    public void shouldPrintFizzBuzzForEveryDivisibleOf3And5Both() {
        Game game = new Game(30);
        assertEquals("FizzBuzz", game.printFizzBuzz().get(14));
        assertEquals("FizzBuzz", game.printFizzBuzz().get(29));
    }

}