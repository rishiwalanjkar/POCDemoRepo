package com.example.pocdemo;

import db.initiator.DBCopier;
import db.retrieve.DBForDetailsAcitvity;
import db.retrieve.DBForHomeAcitvity;
import android.R.string;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;
import app.deploy.Creator;

public class HomeActivity extends Activity {
	private ListView mListViewVoterName;
	private Bundle mbundle;
	private String[] mVoterNames;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		Creator.deploy(getApplicationContext());
		new DBCopier(getApplicationContext());

		mListViewVoterName = (ListView) findViewById(R.id.home_listView);
		mVoterNames=DBForHomeAcitvity.getVoterNames();
		mListViewVoterName.setAdapter(new ArrayAdapter<String>(
				getApplicationContext(), android.R.layout.simple_list_item_1,
				mVoterNames));
		mListViewVoterName.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				String[] Details=DBForDetailsAcitvity.getVoterDetails(mVoterNames[position]);
//				bundle = new Bundle();
//				bundle.putStringArray("Details", DBForDetailsAcitvity
//						.getVoterDetails(mListViewVoterName.getSelectedItem()
//								.toString()));
				if(Details!=null)
				startActivity(new Intent(getApplicationContext(),
						DetailsActivity.class).putExtra("Details",Details ));
			}
		});
	}

}
