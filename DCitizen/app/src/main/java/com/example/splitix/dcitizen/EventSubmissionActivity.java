package com.example.splitix.dcitizen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.splitix.dcitizen.Events.EventContainer;

//TODO onclick button highlighting
//TODO color repeats instead of alternating occasionally on Note3

public class EventSubmissionActivity extends AppCompatActivity {

    ImageButton mSubmitButton;
    EditText mTitle;
    EditText mBlurb;
    EditText mTags;
    EventContainer newEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_submission);

        mSubmitButton = (ImageButton) findViewById(R.id.submit_button);
        mTitle = (EditText) findViewById(R.id.edit_title);
        mBlurb = (EditText) findViewById(R.id.edit_description);
        mTags = (EditText) findViewById(R.id.edit_tag);


        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newEvent.setTitle(mTitle.getText().toString());
                newEvent.setBlurb(mBlurb.getText().toString());
            }
        });
    }
}
