package com.example.android.fcetrainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CurrentPaperActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_paper);

        //set the textviews
        TextView currentCategory = findViewById(R.id.category_text_view);
        TextView currentTaskType = findViewById(R.id.task_type_text_view);

        //get the info from the itent
        currentCategory.setText(getIntent().getStringExtra("category"));
        currentCategory.setText(getIntent().getStringExtra("task type"));
    }
}
