package search;

import org.junit.jupiter.api.Test;
import utils.SearchSubString;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchSybStringTests {


    @Test
    void empty_str_test() {
        assertEquals("", SearchSubString.getLongestSubstringTwoDistinct(""));
    }

    @Test
    void one_symbol_str_test() {
        assertEquals("aaa", SearchSubString.getLongestSubstringTwoDistinct("aaa"));
    }

    @Test
    void one_combination_one_test() {
        assertEquals("aabba", SearchSubString.getLongestSubstringTwoDistinct("aabbacddd"));
    }

    @Test
    void one_combination_two_test() {
        assertEquals("cdddd", SearchSubString.getLongestSubstringTwoDistinct("aabbcdddd"));
    }
    @Test
    void one_combination_three_test() {
        assertEquals("bbddddd", SearchSubString.getLongestSubstringTwoDistinct("aabbddddd"));
    }

    @Test
    void one_combination_four_test() {
        assertEquals("aabbb", SearchSubString.getLongestSubstringTwoDistinct("aabbb"));
    }
}
