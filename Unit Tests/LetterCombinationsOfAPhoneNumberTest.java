package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LetterCombinationsOfAPhoneNumberTest {
	
	List<String> r1 = new ArrayList<>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
	List<String> r2 = new ArrayList<>(Arrays.asList("a","b","c"));
	List<String> r3 = new ArrayList<>(Arrays.asList("adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"));
	List<String> r4 = new ArrayList<>(Arrays.asList("jmpt","jmpu","jmpv","jmqt","jmqu","jmqv","jmrt","jmru","jmrv","jmst","jmsu","jmsv","jnpt","jnpu","jnpv","jnqt","jnqu","jnqv","jnrt","jnru","jnrv","jnst","jnsu","jnsv","jopt","jopu","jopv","joqt","joqu","joqv","jort","joru","jorv","jost","josu","josv","kmpt","kmpu","kmpv","kmqt","kmqu","kmqv","kmrt","kmru","kmrv","kmst","kmsu","kmsv","knpt","knpu","knpv","knqt","knqu","knqv","knrt","knru","knrv","knst","knsu","knsv","kopt","kopu","kopv","koqt","koqu","koqv","kort","koru","korv","kost","kosu","kosv","lmpt","lmpu","lmpv","lmqt","lmqu","lmqv","lmrt","lmru","lmrv","lmst","lmsu","lmsv","lnpt","lnpu","lnpv","lnqt","lnqu","lnqv","lnrt","lnru","lnrv","lnst","lnsu","lnsv","lopt","lopu","lopv","loqt","loqu","loqv","lort","loru","lorv","lost","losu","losv"));
	
	
	
	@Test
	public void test() {
		assertEquals(r1, LetterCombinationsOfAPhoneNumber.letterCombinations("23"));
		assertEquals(r2, LetterCombinationsOfAPhoneNumber.letterCombinations("2"));
		assertEquals(r3, LetterCombinationsOfAPhoneNumber.letterCombinations("234"));
		assertEquals(r4, LetterCombinationsOfAPhoneNumber.letterCombinations("5678"));
	}

}
