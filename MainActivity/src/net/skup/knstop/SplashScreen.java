package net.skup.knstop;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		Thread logoTimer = new Thread() {
			public void run(){
				try{
					int logoTimer = 0;
					//logo timer runs for 2 seconds
					while(logoTimer < 2000){
						sleep(100);
						logoTimer = logoTimer +100;
					};
					startActivity(new Intent(SplashScreen.this, BasicMapActivity.class));
				} 

				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				finally{
					finish();
				}
			}
		};

		logoTimer.start();

	}
}
