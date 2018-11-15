package com.example.android.fcetrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SpeakingActivity extends AppCompatActivity {

    ConstraintLayout root;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking);
        root = findViewById(R.id.root_speaking_parts);

        //add the list of task in speaking activity
        String [] speakingParts = new String [4];
        speakingParts[0] = "part 1: interview";
        speakingParts[1] = "part 2: individual long turn";
        speakingParts[2] = "part 3: collaborative tasks";
        speakingParts[3] = "part 4: discussion";

        for(int index = 0; index < speakingParts.length; index++){
            TextView speakingPartView = new TextView(this);
            speakingPartView.setText(speakingParts[index]);
            root.addView(speakingPartView);

        }

    }
}
