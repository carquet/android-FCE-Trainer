package com.example.android.fcetrainer;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout mainRoot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRoot = findViewById(R.id.main_root);

        final String[] categories = new String[4];
        categories[0] = "speaking";
        categories[1] = "writing";
        categories[2] = "listening";
        categories[3] = "reading";

        for (final String category1 : categories) {
            TextView categoryView = new TextView(this);
            categoryView.setText(category1);
            categoryView.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;
                    switch (category1) {
                        case "speaking":
                            i = new Intent(MainActivity.this, SpeakingActivity.class);
                            startActivity(i);
                            break;
                        case "writing":
                            Toast.makeText(getApplicationContext(), "you just chose " + category1, Toast.LENGTH_LONG).show();
                            i = new Intent(MainActivity.this, WritingActivity.class);
                            startActivity(i);
                            break;
                        case "listening":
                            Toast.makeText(getApplicationContext(), "you just chose " + category1, Toast.LENGTH_LONG).show();
                            i = new Intent(MainActivity.this, ListeningActivity.class);
                            startActivity(i);
                            break;
                        case "reading":
                            i = new Intent(MainActivity.this, ReadingActivity.class);
                            startActivity(i);
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "you have to chose a category", Toast.LENGTH_LONG).show();
                            break;


                    }

                }
            }));
            mainRoot.addView(categoryView);

        }


    }
}
