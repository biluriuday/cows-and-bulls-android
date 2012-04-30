package com.sampleapp.cowsandbulls;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends Activity {
	private Intent selectGame = null;
	public static final String EXTRA_WORDLEN = "com.sampleapp.cowsandbulls.wordlength";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepage);
	}
	
	public void btnStart4LetterClicked(View v) {
		selectGame = new Intent(this, CowsAndBullsActivity.class);
		selectGame.putExtra(EXTRA_WORDLEN, "4");
		startActivity(selectGame);
	}
	
	public void btnStart5LetterClicked(View v) {
		selectGame = new Intent(this, CowsAndBullsActivity.class);
		selectGame.putExtra(EXTRA_WORDLEN, "5");
		startActivity(selectGame);
	}

}
