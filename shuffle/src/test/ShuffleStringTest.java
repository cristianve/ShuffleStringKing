package test;

import com.string.ShuffleString;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleStringTest {

    /**
     * Class under test
     */
    ShuffleString sut;

    private static final String INPUT_EXAMPLE_STRING_1 = "codeleet";
    private static final int[] INPUT_EXAMPLE_INDICES_1 = {4, 5, 6, 7, 0, 2, 1, 3};
    private static final String EXPECTED_OUTPUT_STRING_1 = "leetcode";
    private static final String INCORRECT_OUTPUT_STRING_1 = "codeleet";


    private static final String INPUT_EXAMPLE_STRING_2 = "abc";
    private static final int[] INPUT_EXAMPLE_INDICES_2 = {0,1,2};
    private static final String EXPECTED_OUTPUT_STRING_2 = "abc";
    private static final String INCORRECT_OUTPUT_STRING_2 = "cba";

    private static final String INPUT_EXAMPLE_STRING_3 = "aiohn";
    private static final int[] INPUT_EXAMPLE_INDICES_3 = {3,1,4,2,0};
    private static final String EXPECTED_OUTPUT_STRING_3 = "nihao";
    private static final String INCORRECT_OUTPUT_STRING_3 = "aionh";

    private static final String INPUT_EXAMPLE_STRING_4 = "aaiougrt";
    private static final int[] INPUT_EXAMPLE_INDICES_4 = {4,0,2,6,7,3,1,5};
    private static final String EXPECTED_OUTPUT_STRING_4 = "arigatou";
    private static final String INCORRECT_OUTPUT_STRING_4 = "aaiougtr";

    private static final String INPUT_EXAMPLE_STRING_5 = "art";
    private static final int[] INPUT_EXAMPLE_INDICES_5 = {1,0,2};
    private static final String EXPECTED_OUTPUT_STRING_5 = "rat";
    private static final String INCORRECT_OUTPUT_STRING_5 = "tar";


    @Test
    public void when_executeRestoreString_given_correctExpectedOutput_then_expectedOutputIsEquals() {

        assertTrue(sut.restoreString(INPUT_EXAMPLE_STRING_1,INPUT_EXAMPLE_INDICES_1).equals(EXPECTED_OUTPUT_STRING_1));
        assertTrue(sut.restoreString(INPUT_EXAMPLE_STRING_2,INPUT_EXAMPLE_INDICES_2).equals(EXPECTED_OUTPUT_STRING_2));
        assertTrue(sut.restoreString(INPUT_EXAMPLE_STRING_3,INPUT_EXAMPLE_INDICES_3).equals(EXPECTED_OUTPUT_STRING_3));
        assertTrue(sut.restoreString(INPUT_EXAMPLE_STRING_4,INPUT_EXAMPLE_INDICES_4).equals(EXPECTED_OUTPUT_STRING_4));
        assertTrue(sut.restoreString(INPUT_EXAMPLE_STRING_5,INPUT_EXAMPLE_INDICES_5).equals(EXPECTED_OUTPUT_STRING_5));

    }

    @Test
    public void when_executeRestoreString_given_incorrectExpectedOutputInWrongOrder_then_expectedOutputIsNotEquals() {

        assertFalse(sut.restoreString(INPUT_EXAMPLE_STRING_1,INPUT_EXAMPLE_INDICES_1).equals(INCORRECT_OUTPUT_STRING_1));
        assertFalse(sut.restoreString(INPUT_EXAMPLE_STRING_2,INPUT_EXAMPLE_INDICES_2).equals(INCORRECT_OUTPUT_STRING_2));
        assertFalse(sut.restoreString(INPUT_EXAMPLE_STRING_3,INPUT_EXAMPLE_INDICES_3).equals(INCORRECT_OUTPUT_STRING_3));
        assertFalse(sut.restoreString(INPUT_EXAMPLE_STRING_4,INPUT_EXAMPLE_INDICES_4).equals(INCORRECT_OUTPUT_STRING_4));
        assertFalse(sut.restoreString(INPUT_EXAMPLE_STRING_5,INPUT_EXAMPLE_INDICES_5).equals(INCORRECT_OUTPUT_STRING_5));

    }


}
