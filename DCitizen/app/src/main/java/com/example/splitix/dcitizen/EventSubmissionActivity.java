package com.example.splitix.dcitizen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.splitix.dcitizen.Events.EventContainer;

//TODO onclick button highlighting

public class EventSubmissionActivity extends AppCompatActivity {

    ImageButton mSubmit;
    ImageButton mCameraButton;
    ImageButton mLinkButton;
    ImageButton mMapButton;
    private static final int REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_submission);

        mCameraButton = (ImageButton) findViewById(R.id.camera_button);

        EditText mTitle;
        EditText mBlurb;
        EditText mTags;

        mCameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Bring up gallery (ImagePickActivity)
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_CODE);

            }
        });


    }
}
