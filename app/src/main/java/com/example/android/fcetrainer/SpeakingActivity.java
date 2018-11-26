package com.example.android.fcetrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SpeakingActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking);


        //Add ArrayList for performance
        ArrayList<Paper> speakingParts = new ArrayList<Paper>();
        speakingParts.add(new Paper("1", "interview", "a conversation between the interlocutor and each candidate", "the focus is on general interactional and social language", "not specific", "the questions are related to the candidate life", "this part tests the candidates' ability to use social and interactional language", "2 minutes"));
        speakingParts.add(new Paper("2", "long turn", "An individual long turn for each candidate with the response from the second candidate. In turn, the candidates are given a pair of photographs to talk about.", "The focus is on organizing a larger unit of discourse, comparing, describing and expressing opinions", "nost specific", "do not stop until the examiner says thank you, do not describe, fixed phrases such as passive, impersonal, relative clause... ", "this part tests the candidates' ability to use social and interactional language", "1 minute long-turn for each candidate plus a 30 seconds response from the other candidate: the total time for part 2 is 4 minutes."));


        PaperAdapter paperAdapter = new PaperAdapter(this, speakingParts);
        ListView paperListView = findViewById(R.id.speaking_listView);
        paperListView.setAdapter(paperAdapter);


    }
}
