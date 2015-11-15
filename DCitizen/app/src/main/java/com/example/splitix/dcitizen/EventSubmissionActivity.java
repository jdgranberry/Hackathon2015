package com.example.splitix.dcitizen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


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

