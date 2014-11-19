package ca.ualberta.cs.lonelytweet;

import java.io.Serializable;
import java.util.Date;

import android.util.Log;

public class ImportantLonelyTweet extends LonelyTweet {  //removed serializable

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) { //Right click on method name, Refactor > change signature
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String string = getTweetDate() + " | " + getTweetBody();
		Log.i("output string", string);
		return string;
	}

	public String getTweetBody() {
		return tweetBody.toUpperCase();
	}
}