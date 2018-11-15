package com.example.android.fcetrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class SpeakingActivity extends AppCompatActivity {

    ConstraintLayout root;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking);
        root = findViewById(R.id.root_speaking_parts);



        //Add ArrayList for performance
        ArrayList<String> speakingParts = new ArrayList<String>();
        speakingParts.add("part 1: interview");
        speakingParts.add("part 2: individual long turn");
        speakingParts.add("part 3: collaborative tasks");
        speakingParts.add("part 4: discussion");



        for(int index = 0; index < speakingParts.size(); index++){
            TextView speakingPartView = new TextView(this);
            speakingPartView.setText(speakingParts.get(index));
            root.addView(speakingPartView);

        }

    }
}
