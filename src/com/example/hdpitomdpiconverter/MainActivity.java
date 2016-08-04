package com.example.hdpitomdpiconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getWindow().setSoftInputMode (WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
	}

	public void calculate(View v) {
		
		EditText editText = (EditText) findViewById(R.id.edittext);
		String stringValue = editText.getText().toString();
		int intValue = Integer.parseInt(stringValue);
		int result = intValue * 3 /4;
		TextView resultTextview = (TextView) findViewById(R.id.textview);
		resultTextview.setText(result + "");
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
