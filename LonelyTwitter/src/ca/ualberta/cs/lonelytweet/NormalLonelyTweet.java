package ca.ualberta.cs.lonelytweet;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {  //removed serializable

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) { //Right click on method name, Refactor > change signature
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}

	public String getTweetBody() {
		return tweetBody;
	}
}