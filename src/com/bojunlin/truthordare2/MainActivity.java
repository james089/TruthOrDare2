/* Change log:
 * truthordare 2.3 (13.4.25): 
 * 1. Show the question in a dialog
 * 2. Put the questions to a new class
 * 3. Add mode choose
 *
 * truthordare 2.2 (12.12.27): Add sound when changing the question. Modified some questions.
 *
 * truthordare 2.1 (12.12.26): move the questions to the first screen, deleted display message activity.
 * 
 * truthordare 2.0 (12.12.26): shake to shuffle the question, the question will show in another screen, must use back button to go back
 * 
 * truthordare 1.1 (12.12.24): Add a picture in the main activity.
 * 
 * truthordare 1.0 (12.12.20): First version, push a button to change a question, the questions are in another activity.
 *  
 *  Made by Bojun Lin
 * */

package com.bojunlin.truthordare2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends Activity {
	    
	    public final static String EXTRA_MESSAGE = "efe";
	    public final static int TRUTH = 1;
	    public final static int DARE = 2;
	    public final static int TRUTH_DARE = 3;
	
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
  
	}
	    public void sendMessage1(View view) {
	    	Intent intent1 = new Intent(this, Game.class);
	        int message = TRUTH;
	        intent1.putExtra(EXTRA_MESSAGE, message);
	        startActivity(intent1);
		}
	    public void sendMessage2(View view) {
	    	Intent intent2 = new Intent(this, Game.class);
	        int message = DARE;
	        intent2.putExtra(EXTRA_MESSAGE, message);
	        startActivity(intent2);
		}
	    public void sendMessage3(View view) {
	    	Intent intent3 = new Intent(this, Game.class);
	        int message = TRUTH_DARE;
	        intent3.putExtra(EXTRA_MESSAGE, message);
	        startActivity(intent3);
		}
	
}
