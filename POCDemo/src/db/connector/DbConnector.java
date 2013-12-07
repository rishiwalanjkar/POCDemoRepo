package db.connector;

import android.database.sqlite.SQLiteDatabase;
import app.deploy.directory;

public class DbConnector {
	private static String DB_PATH = directory.databaseFolderPath+"/";
	private static String DB_NAME = "dbo.sqlite";
	private static SQLiteDatabase applicationDatabase;
	
	public static SQLiteDatabase open() {
		// Open the database
		String mypath = DB_PATH + DB_NAME;
		applicationDatabase = SQLiteDatabase.openDatabase(mypath, null,
				SQLiteDatabase.OPEN_READWRITE);
		return applicationDatabase;
	}

	public static void close() {
		applicationDatabase.close();
	}

}
