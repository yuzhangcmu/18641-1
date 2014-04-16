package edu.cmu.smartphone.telemedicine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends Activity {

	EditText nameEditText;
	EditText emailEditText;
	EditText passwordEditText;
	Button registerButton;
	TextView loginTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registerview);
		
		nameEditText = (EditText)findViewById(R.id.reg_fullname);
		emailEditText = (EditText)findViewById(R.id.reg_email);
		passwordEditText = (EditText)findViewById(R.id.reg_password);
		
		registerButton = (Button)findViewById(R.id.reg_btnRegister);
		loginTextView = (TextView)findViewById(R.id.reg_link_to_login);
		
		registerButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});

		loginTextView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}

}