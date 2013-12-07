package db.retrieve;

import java.util.ArrayList;

import db.connector.DbConnector;
import db.table.details.VoterList;

import android.database.Cursor;

public class DBForDetailsAcitvity {
	private static String[] VoterName;

	/**
	 * Function to get voter Details
	 */
	public static String[] getVoterDetails(String VoterName) {
		Cursor cursor = DbConnector.open().rawQuery(
				"select " + VoterList.voter_list.VoterId+","
						+ VoterList.voter_list.VoterParentName+","
						+ VoterList.voter_list.AreaId+","
						+ VoterList.voter_list.VillageId + " from "
						+ VoterList.voter_list.TableName +" where "+VoterList.voter_list.VoterName+"= ?", new String[]{VoterName});

		String[] Details=new String[5];
		if (cursor.moveToFirst()) {
		   Details[0]=String.valueOf(cursor.getInt(0));
		   Details[1]=VoterName;
		   Details[2]=cursor.getString(1);
		   Details[3]=String.valueOf(cursor.getInt(2));
		   Details[4]=String.valueOf(cursor.getInt(3));
		}
		DbConnector.close();
		return Details;

	}

}
