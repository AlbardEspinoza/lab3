import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    		int[] input1 = { 3 };
    		ArrayExamples.reverseInPlace(input1);
    		assertArrayEquals(new int[]{ 3 }, input1);
	}


  	@Test
  	public void testReversed() {
    		int[] input1 = { };
    		assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  	}	

	@Test
	public void testReversedInPlace2() {
		int[] input1 = {1, 2, 3, 4};
		ArrayExamples.reverseInPlace(input1);
                assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input1);
	}

	@Test
	public void testReversed2() {
                int[] input1 = {1, 2, 3};
		assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input1));
        }
	
	@Test
	public void testAverageWithoutLowest_EmptyArray() {
		double[] input1 = {};
		assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
	}

	@Test
        public void testAverageWithoutLowest_OneElement() {
                double[] input1 = {1};
                assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
        }	
	
	@Test
        public void testAverageWithoutLowest_EvenAmountOfElements() {
                double[] input1 = {7, 4, 6, 2};
                assertEquals(5.666666666666667, ArrayExamples.averageWithoutLowest(input1), 0);
        }

	@Test
	public void testAverageWithoutLowest_OddAmountOfElements() {
                double[] input1 = {9, 3, 3, 7, 1};
                assertEquals(5.5, ArrayExamples.averageWithoutLowest(input1), 0);
        }
	
	@Test
	public void testAverageWithoutLowest_WithNegativeElements() {
                double[] input1 = {1, 4, 3, -20, -20};
                assertEquals(-3, ArrayExamples.averageWithoutLowest(input1), 0);
        }
}
