package com.example.android.fcetrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView readingTextView;
    TextView writingTextView;
    TextView listeningTextView;
    TextView speakingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning textview
        readingTextView = findViewById(R.id.reading_textview);
        writingTextView = findViewById(R.id.writing_textview);
        listeningTextView = findViewById(R.id.listening_textview);
        speakingTextView = findViewById(R.id.speaking_textview);



    }
}
