package likesVsDislikes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LikesVsDislikesTest {
	
	@Test
	public void test01() { 
		assertEquals("Dislike", LikesVsDislikes.likeOrDislike(new String[] {"Dislike"}));
	}

	@Test
	public void test02() { 
		assertEquals("Nothing", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Like"}));
	}

	@Test
	public void test03() { 
		assertEquals("Nothing", LikesVsDislikes.likeOrDislike(new String[] {"Dislike", "Dislike"}));
	}

	@Test
	public void test04() { 
		assertEquals("Like", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Like", "Like"}));
	}

	@Test
	public void test05() { 
		assertEquals("Dislike", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Dislike"}));
	}

	@Test
	public void test06() { 
		assertEquals("Like", LikesVsDislikes.likeOrDislike(new String[] {"Dislike", "Like"}));
	}

	@Test
	public void test07() { 
		assertEquals("Nothing", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Dislike", "Dislike"}));
	}

	@Test
	public void test08() { 
		assertEquals("Dislike", LikesVsDislikes.likeOrDislike(new String[] {"Dislike", "Like", "Dislike"}));
	}

	@Test
	public void test09() { 
		assertEquals("Nothing", LikesVsDislikes.likeOrDislike(new String[] {}));
	}

	@Test
	public void test10() { 
		assertEquals("Dislike", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Like", "Dislike", "Like", "Like", "Like", "Like", "Dislike"}));
	}

	@Test
	public void test11() { 
		assertEquals("Like", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Like", "Dislike", "Like", "Dislike", "Like", "Like", "Like"}));
	}

	@Test
	public void test12() { 
		assertEquals("Nothing", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Like", "Dislike", "Like", "Like", "Like", "Like", "Dislike", "Dislike", "Like", "Like", "Like", "Like", "Dislike", "Dislike", "Like", "Like", "Like", "Dislike", "Dislike"}));
	}

	@Test
	public void test13() { 
		assertEquals("Dislike", LikesVsDislikes.likeOrDislike(new String[] {"Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike", "Like", "Dislike"}));
	}
}
