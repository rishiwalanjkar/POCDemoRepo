package com.example.pocdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class DetailsActivity extends Activity {
    TextView VoterID,VoterName,ParentName,AreaID,VillageID;
    String[] Details;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
		Details=getIntent().getStringArrayExtra("Details");
		
		VoterID=(TextView)findViewById(R.id.activity_details_VoterID);
		VoterName=(TextView)findViewById(R.id.activity_detailsVoterName);
		ParentName=(TextView)findViewById(R.id.activity_detailsParentName);
		AreaID=(TextView)findViewById(R.id.activity_detailsAreID);
		VillageID=(TextView)findViewById(R.id.activity_detailsVillageID);
		if(Details!=null){
			VoterID.setText(Details[0]);
			VoterName.setText(Details[1]);
			ParentName.setText(Details[2]);
			AreaID.setText(Details[3]);
			VillageID.setText(Details[4]);
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.details, menu);
		return true;
	}

}
