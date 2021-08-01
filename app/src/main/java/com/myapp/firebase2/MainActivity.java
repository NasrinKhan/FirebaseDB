package com.myapp.firebase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button saveDataButton;
    private EditText nameEditText,ageEditText;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseReference =FirebaseDatabase.getInstance().getReference("student");
        saveDataButton = findViewById(R.id.saveDataBottonId);
        nameEditText=findViewById(R.id.namwEditTextId);
        ageEditText =findViewById(R.id.ageEditTextId);
        saveDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }
    public void saveData(){
        String name =nameEditText.getText().toString().trim();
        String age=ageEditText.getText().toString().trim();
    }
}