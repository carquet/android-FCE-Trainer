package com.example.android.fcetrainer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PaperAdapter extends ArrayAdapter<Paper> {
    
    public PaperAdapter(Activity context, ArrayList<Paper> papers){
        super(context, 0, papers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
        }

        //iterate through the ArrayList of Paper
        Paper currentPaper = getItem(position);

        //PART
        //find the template in the convertview
        TextView partTextView = listItemView.findViewById(R.id.part_text_view);
        //inject the info
        partTextView.setText(currentPaper.getnPart());

        //PART NAME
        TextView partNameTextView = listItemView.findViewById(R.id.part_name_text_view);
        //inject the info
        partNameTextView.setText(currentPaper.getnPartName());

        //PART TASK TYPE
        TextView taskTypeTextView = listItemView.findViewById(R.id.task_type_text_view);
        //inject the info
        taskTypeTextView.setText(currentPaper.getnTaskType());

        //PART FOCUS
        TextView focusTextView = listItemView.findViewById(R.id.focus_text_view);
        //inject the info
        focusTextView.setText(currentPaper.getnFocus());

        //PART TIMING
        TextView timingTextView = listItemView.findViewById(R.id.timing_text_view);
        //inject the info
        timingTextView.setText(currentPaper.getnTiming());



        return listItemView;
    }
}
