package com.example.android.fcetrainer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SpeakingActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        //Add ArrayList for performance
        final ArrayList<Paper> speakingParts = new ArrayList<Paper>();
        speakingParts.add(new Paper("speaking", "Part 1", "Interview", "a conversation between the interlocutor and each candidate", "the focus is on general interactional and social language", "not specific", "the questions are related to the candidate life", "this part tests the candidates' ability to use social and interactional language", "2 minutes"));
        speakingParts.add(new Paper("speaking","Part 2", "Long turn", "An individual long turn for each candidate with the response from the second candidate. In turn, the candidates are given a pair of photographs to talk about.", "The focus is on organizing a larger unit of discourse, comparing, describing and expressing opinions", "nost specific", "do not stop until the examiner says thank you, do not describe, fixed phrases such as passive, impersonal, relative clause... ", "this part tests the candidates' ability to use social and interactional language", "1 minute long-turn for each candidate plus a 30 seconds response from the other candidate: the total time for part 2 is 4 minutes."));
        speakingParts.add(new Paper("speaking","Part 3", "Collaborative task", "a two-way conversation between the candidates. They are given spoken instructions with written stimuli which are used in the discussion and decision making", "The focus is sustaining an interaction:exchanging ideas, agreeing and/or disagreeing, suggesting, speculating, evaluating, reaching a decision through negociation", "not specific", "Listen to your partner, be interested in what they have to say.", "This part tests the candidates'ability to engage in a discussion and to work towards a negociated outcome of the task set.", "2 minutes discussion followed by a one minute decision-making task: the total time for part 3 is 4 minutes."));
        speakingParts.add(new Paper("speaking","Part 4", "discussion", "a discussion topic related to part 3", "the focus is expressing and justify opinion", "not specific", "see speaking scale", "see speaking scale", "4 minutes"));

        PaperAdapter paperAdapter = new PaperAdapter(this, speakingParts);
        ListView paperListView = findViewById(R.id.listView);
        paperListView.setAdapter(paperAdapter);

        //if the item is clicked, it moves to a page that describes the part in more details
        paperListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Paper currentPaper = speakingParts.get(position);
                String currentCategory = currentPaper.getnCategory();
                String currentPart = currentPaper.getnPart();
                String currentTaskType = currentPaper.getnTaskType();

                //create an intent that push the information to a new layout
                Intent oneItemIntent = new Intent(SpeakingActivity.this, CurrentPaperActivity.class);
                oneItemIntent.putExtra("category", currentCategory);
                oneItemIntent.putExtra("task type", currentTaskType);
                startActivity(oneItemIntent);
            }
        });

    }
}
