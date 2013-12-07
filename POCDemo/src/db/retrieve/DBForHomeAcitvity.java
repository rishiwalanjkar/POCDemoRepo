package db.retrieve;

import java.util.ArrayList;

import db.connector.DbConnector;
import db.table.details.VoterList;

import android.database.Cursor;

public class DBForHomeAcitvity {
	private static String[] VoterName;

	/**
	 * Function to get voter names
	 */
	public static String[] getVoterNames() {
		Cursor cursor = DbConnector.open().rawQuery(
				"select " + VoterList.voter_list.VoterName + " from "
						+ VoterList.voter_list.TableName, null);
		
		if (cursor.moveToFirst()) {
			VoterName = new String[cursor.getCount()];
			int cnt=0;
           do{
        	   VoterName[cnt++]=cursor.getString(0);
           }while(cursor.moveToNext());
		}
		DbConnector.close();
		return VoterName;

	}

}
