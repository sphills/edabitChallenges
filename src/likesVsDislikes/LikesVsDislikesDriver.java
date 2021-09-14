package likesVsDislikes;

public class LikesVsDislikesDriver {

	public static void main(String[] args) {
		LikesVsDislikes testLikes = new LikesVsDislikes();

		/* Now that I have included the LikesVsDislikesTest.java and made the likeOrDislike() static, these lines are no longer relevant.
		 * retained for posterity
		 */
//		System.out.println(testLikes.likeOrDislike(new String[]{"Like", "Like"}));
//		System.out.println(testLikes.likeOrDislike(new String[]{"Like", "Dislike"}));
//		System.out.println(testLikes.likeOrDislike(new String[]{"Dislike"}));
//		System.out.println(testLikes.likeOrDislike(new String[]{}));
		
		LikesVsDislikesTest testTester = new LikesVsDislikesTest();
		testTester.test01();
	}

}
