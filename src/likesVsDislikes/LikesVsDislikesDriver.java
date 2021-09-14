package likesVsDislikes;

public class LikesVsDislikesDriver {

	public static void main(String[] args) {
		LikesVsDislikes testLikes = new LikesVsDislikes();

		System.out.println(testLikes.likeOrDislike(new String[]{"Like", "Like"}));
		System.out.println(testLikes.likeOrDislike(new String[]{"Like", "Dislike"}));
		System.out.println(testLikes.likeOrDislike(new String[]{"Dislike"}));
		System.out.println(testLikes.likeOrDislike(new String[]{}));
	}

}
