package edu.cmu.smartphone.telemedicine.DBLayout.copy;

import java.util.Formatter;
import java.util.LinkedList;
import java.util.Locale;

import edu.cmu.smartphone.telemedicine.entities.Contact;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DaoContact extends ContextWrapper{
    String dbTeleMedicine = "dbTeleMedicine";

    public DaoContact(Context base) {
        super(base);
        // TODO Auto-generated constructor stub
    }

    SQLiteDatabase myDB = null;
    
    public LinkedList<Contact> getContactList() {
        LinkedList<Contact> contactList = new LinkedList<Contact>();
        
        String sql = "SELECT * FROM " + "TableContact";
        Cursor c = myDB.rawQuery(sql, null);
        
        c.moveToFirst();
        if (c != null) {
            //
        }
        
        return contactList;
    }
    
    public void addContact(int UserID, String Type, String Email, String Phone, 
            String Nation, String Province, String City, String name, String LoginID, 
            String intro, String headPortrait, String age, String password) { 
        String tableContact = "TableContact";
 
        try {
            // Get the database if database is not exists create new database 
            // Database name is " test " 
            myDB = this.openOrCreateDatabase(dbTeleMedicine, MODE_PRIVATE, null);
             
            StringBuilder sb = new StringBuilder();
            
            // Send all output to the Appendable object sb
            Formatter formatter = new Formatter(sb, Locale.US);
            
            // Create contact table
            myDB.execSQL("CREATE TABLE IF NOT EXISTS " + tableContact
                    + " (Id INTEGER not NULL AUTO_INCREMENT, "
                    + "UserID integer, Type VARCHAR(50), Email VARCHAR(255), Phone VARCHAR(30),"
                    + "Nation VARCHAR(255), Province VARCHAR(255),"
                    + "City VARCHAR(255), Name VARCHAR(255), LoginID VARCHAR(255), "
                    + "Intro VARCHAR(300), HeadPortrait VARCHAR(255), "
                    + "Age integer, Password VARCHAR(255), PRIMARY KEY ( Id ));");

            // Explicit argument indices may be used to re-order output.
            formatter.format("REPLACE INTO %s (UserID, Type, Email, Phone, Nation, Province,"
                    + "City, Name, LoginID, Intro, HeadPortrait, Age, Password) "
                    + "VALUES ('%d', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s');",
                    UserID, Type, Email, Phone, Nation, Province, City, name, LoginID,
                    intro, headPortrait, age, password
                    );
            formatter.close();
     
            myDB.execSQL(sb.toString());
 
            Toast.makeText(getBaseContext(), "New contact save to database",Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Log.e("Error", "Error", e);
 
            Toast.makeText(getBaseContext(),
                    "Error in creating database or Table", Toast.LENGTH_LONG).show();
        }
    }
    
    
}
