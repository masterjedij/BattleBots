package edu.barella4730.battlebots;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class BattleBots extends Activity implements OnClickListener {

	EditText servAddIn, appMsgs;
	int port = 3012;
	Button connect;
	Thread myNet;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_connect);
		
		appMsgs = (EditText) findViewById(R.id.appMsgs);
	    appMsgs.append("\n");
	        servAddIn = (EditText) findViewById(R.id.serverAddIn);
	        servAddIn.setText("10.0.2.2");
		connect = (Button) findViewById(R.id.btnConnect);
		connect.setOnClickListener(this);
	}

	
	public void onClick(View v){
		
		switch(v.getId()){
			case R.id.btnConnect:
				//setContentView(R.layout.activity_battle_bots);
			break;
			
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.battle_bots, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
