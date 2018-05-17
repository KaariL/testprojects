package e.kaari.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class GetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_activity);
    }
    public void readName(View view) {
        //
        String randomName = ;//read from firebase
        TextView textView = findViewById(R.id.nameView);
        textView.setText(randomName);
    }

    //do not know if following is required
    FirebaseDatabase database = FirebaseDatabase.getInstance();
}
