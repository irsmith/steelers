package net.skup.knstop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginRequestActivity extends Activity {

	EditText txtUserName;
	EditText txtPassword;
	Button btnLogin;
	Button btnCancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		txtUserName=(EditText)this.findViewById(R.id.txtUname);
		txtPassword=(EditText)this.findViewById(R.id.txtPwd);
		btnLogin=(Button)this.findViewById(R.id.btnLogin);
		btnLogin=(Button)this.findViewById(R.id.btnLogin);
		final Activity thisAct = this;
		btnLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if((txtUserName.getText().toString()).equals(txtPassword.getText().toString())){
					Intent i = new Intent(thisAct, DetailActivity.class);
					i.putExtra("title", "New at My Location");
					startActivity(i);
					//Toast.makeText(LoginRequestActivity.this, "Login Successful",Toast.LENGTH_LONG).show();
				} else{
					Toast.makeText(LoginRequestActivity.this, "Invalid Login",Toast.LENGTH_LONG).show();
				}

			}
		});       
	}		




}
