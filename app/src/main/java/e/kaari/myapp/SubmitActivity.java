package e.kaari.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class SubmitActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_activity);
    }

    // Write a message to the database
    public void writeName(View view) {
        //new name user submitted
        EditText editText = (EditText) findViewById(R.id.editName);
        String newName = editText.getText().toString();
        //continue...

        //

    }

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef = database.getReference("message");

    //myRef.setValue("Hello, World!");
}
