package com.avasyam.homeautomation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity
        extends AppCompatActivity{

    ToggleButton togglebutton;
    TextView textview;
    @Override
    protected void onCreate(
            Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        togglebutton
                = (ToggleButton)findViewById(
                R.id.toggleButton);

        textview
                = (TextView)findViewById(
                R.id.textView);
    }

    public void onToggleClick(View view)
    {
        if (togglebutton.isChecked()) {
            textview.setText("Toggle is ON");
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("LED_STATUS");//LED_STATUS is Firebase database LED_STATUS
            myRef.setValue(1);

        }

        else {
            textview.setText("Toggle is OFF");
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("LED_STATUS");//LED_STATUS is Firebase database LED_STATUS
            myRef.setValue(0);
        }
    }

    private DatabaseReference root = FirebaseDatabase.getInstance().getReference().getRoot();


    }


