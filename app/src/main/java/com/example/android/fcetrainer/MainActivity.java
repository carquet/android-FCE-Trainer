package com.example.android.fcetrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView speakingTextView;
    TextView writingTextView;
    TextView readingTextView;
    TextView listeningTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning textview
        speakingTextView = findViewById(R.id.speaking_textview);
        writingTextView = findViewById(R.id.writing_textview);
        readingTextView = findViewById(R.id.reading_textview);
        listeningTextView = findViewById(R.id.listening_textview);


        speakingTextView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SpeakingActivity.class);
                startActivity(i);
            }
        }));

    }
}
