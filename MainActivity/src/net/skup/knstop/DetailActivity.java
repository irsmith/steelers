package net.skup.knstop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

	ImageView imageView = null;
	TextView textView = null;
	TextView admob = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);

		imageView = (ImageView) findViewById(R.id.img);
		textView = (TextView) findViewById(R.id.titledetail);
		admob = (TextView) findViewById(R.id.admob);
		admob.setSelected(true);

		Intent i = getIntent();
		String title = i.getStringExtra("title");
		if (title.startsWith("Vallco")){
			this.setTitle("Vallco Shopping Mall");
			imageView.setImageDrawable(getResources().getDrawable(R.drawable.valcohorseshoe));
			textView.setText("Wolfe Street horseshoe");
		} else { 
			if (title.startsWith("Homestead")) {
				this.setTitle("Homestead High School");
				imageView.setImageDrawable(getResources().getDrawable(R.drawable.valcohorseshoe));
				textView.setText("Athletic Horseshoe");
			} else if (title.startsWith("Shoreline")) {
				this.setTitle("Shoreline Ampitheator");
				imageView.setImageDrawable(getResources().getDrawable(R.drawable.valcohorseshoe));
				textView.setText("Off site curve");
			} else if (title.startsWith("New")) {
				setContentView(R.layout.activity_detail);
				this.setTitle("New Drop-off");
				imageView.setImageDrawable(getResources().getDrawable(R.drawable.valcohorseshoe));
				textView.setText("Drop-Off site curve");
				
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

}
