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
        speakingParts.add(new Paper("1", "Interview", "a conversation between the interlocutor and each candidate", "the focus is on general interactional and social language", "not specific", "the questions are related to the candidate life", "this part tests the candidates' ability to use social and interactional language", "2 minutes"));
        speakingParts.add(new Paper("2", "Long turn", "An individual long turn for each candidate with the response from the second candidate. In turn, the candidates are given a pair of photographs to talk about.", "The focus is on organizing a larger unit of discourse, comparing, describing and expressing opinions", "nost specific", "do not stop until the examiner says thank you, do not describe, fixed phrases such as passive, impersonal, relative clause... ", "this part tests the candidates' ability to use social and interactional language", "1 minute long-turn for each candidate plus a 30 seconds response from the other candidate: the total time for part 2 is 4 minutes."));
        speakingParts.add(new Paper("3", "Collaborative task", "a two-way conversation between the candidates. They are given spoken instructions with written stimuli which are used in the discussion and decision making", "The focus is sustaining an interaction:exchanging ideas, agreeing and/or disagreeing, suggesting, speculating, evaluating, reaching a decision through negociation", "not specific", "Listen to your partner, be interested in what they have to say.", "This part tests the candidates'ability to engage in a discussion and to work towards a negociated outcome of the task set.", "2 minutes discussion followed by a one minute decision-making task: the total time for part 3 is 4 minutes."));

        PaperAdapter paperAdapter = new PaperAdapter(this, speakingParts);
        ListView paperListView = findViewById(R.id.speaking_listView);
        paperListView.setAdapter(paperAdapter);


    }
}
