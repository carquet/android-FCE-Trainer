package com.example.android.fcetrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ReadingActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Paper> readingPapers = new ArrayList<Paper>();
        readingPapers.add(new Paper("Reading and English in Use", "part 1", "multiple choice cloze", "multiple choice cloze", "vocabulary and idioms","a modified cloze with eight gaps. There are 4 option multiple choice items for each gap.", "", "8 questions", "1minute per question" ));

        PaperAdapter paperAdapter = new PaperAdapter(this, readingPapers);
        ListView paperListView = findViewById(R.id.listView);
        paperListView.setAdapter(paperAdapter);
    }
}
