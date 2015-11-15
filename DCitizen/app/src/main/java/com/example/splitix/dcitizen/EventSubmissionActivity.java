package com.example.splitix.dcitizen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.splitix.dcitizen.Events.EventContainer;

public class EventSubmissionActivity extends AppCompatActivity {

    ImageButton submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_submission);

        EventContainer newEvent;

        EditText mTitle;
        EditText mBlurb;
        EditText mTags;


    }
}
