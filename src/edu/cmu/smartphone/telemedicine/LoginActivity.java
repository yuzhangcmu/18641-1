package edu.cmu.smartphone.telemedicine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

	EditText loginEmailEditText;
	EditText loginPasswordEditText;
	Button loginButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registerview);
		
		loginEmailEditText = (EditText)findViewById(R.id.loginEmail);
		loginPasswordEditText = (EditText)findViewById(R.id.loginPassword);
		
		loginButton = (Button)findViewById(R.id.login_loginBtn);
		
		loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});

		
		
	}

}