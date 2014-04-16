package edu.cmu.smartphone.telemedicine.DBLayout;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import android.widget.Toast;

public class Dao_Sqlite extends ContextWrapper{
    String dbTeleMedicine = "dbTeleMedicine";

    public Dao_Sqlite(Context base) {
        super(base);
        // TODO Auto-generated constructor stub
    }

    SQLiteDatabase myDB = null;
    
    private void createDB() { 
        String tableContact = "TableContact";
        String chatRecord = "TableChatRecord";
        String patient = "TablePatient";
        String doctor = "TableDoctor";
        String recentChat = "TableRecentChat";
 
        try {
            // Get the database if database is not exists create new database 
            // Database name is " test " 
            myDB = this.openOrCreateDatabase(dbTeleMedicine, MODE_PRIVATE, null);
             
            // Create contact table
            myDB.execSQL("CREATE TABLE IF NOT EXISTS " + tableContact
                    + " (Id INTEGER not NULL AUTO_INCREMENT, "
                    + "UserID integer, Type VARCHAR(50), Email VARCHAR(255), Phone VARCHAR(30),"
                    + "Nation VARCHAR(255), Province VARCHAR(255),"
                    + "City VARCHAR(255), Name VARCHAR(255), LoginID VARCHAR(255), "
                    + "Intro VARCHAR(300), HeadPortrait VARCHAR(255), "
                    + "Age integer, Password VARCHAR(255), PRIMARY KEY ( Id ));");
            
            // create chatRecord table.
            myDB.execSQL("CREATE TABLE IF NOT EXISTS " + chatRecord
                    + " (Id INTEGER not NULL AUTO_INCREMENT, "
                    + "Message varchar(max), Status bit, Time datetime, UserID integer,"
                    + "Direction bit,"
                    + "MessageTypeID integer, "
                    + "PRIMARY KEY ( Id )), FOREIGN KEY (UserID) REFERENCES " 
                    + tableContact + "(id) ON DELETE CASCADE;");
            
            // create recentChat table.
            myDB.execSQL("CREATE TABLE IF NOT EXISTS " + recentChat
                    + " (Id INTEGER not NULL AUTO_INCREMENT, "
                    + "userID integer, Time datetime"
                    + "PRIMARY KEY ( Id )), FOREIGN KEY (userID) REFERENCES " 
                    + tableContact + "(id) ON DELETE CASCADE;");
            
            // create patient table.
            myDB.execSQL("CREATE TABLE IF NOT EXISTS " + patient
                    + " (Id INTEGER not NULL AUTO_INCREMENT, "
                    + "UserID integer, Symptom varchar(300),"
                    + "PRIMARY KEY ( Id ));");
            
            // create doctor table.
            myDB.execSQL("CREATE TABLE IF NOT EXISTS " + doctor
                    + " (Id INTEGER not NULL AUTO_INCREMENT, "
                    + "UserID integer, Department varchar(255), Title varchar(255)"
                    + "PRIMARY KEY ( Id ));");
            
 
            Toast.makeText(getBaseContext(), "Database & Table Created",Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Log.e("Error", "Error", e);
 
            Toast.makeText(getBaseContext(),
                    "Error in creating atabase or Table", Toast.LENGTH_LONG).show();
        }
    }
    
    // this method will trigger when user clicked " Drop DB " button 
    public void drop() {
        try {
            // we use deleteDatabse("Database name ") method to delete database 
            // we have to pass String parameter to give the name of database
            deleteDatabase(dbTeleMedicine); 
            Toast.makeText(getBaseContext(), "Databse Deleted", Toast.LENGTH_LONG).show();
            
        } catch (Exception e) {
 
            Log.e("Error", "Error", e);
 
            Toast.makeText(getBaseContext(), "Error in deleting",Toast.LENGTH_LONG).show();
 
        }
    }
}
