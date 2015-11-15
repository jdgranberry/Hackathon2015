package com.example.splitix.dcitizen;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import org.w3c.dom.Text;

public class EventDetail extends AppCompatActivity {

    private TextView title_view;
    private TextView description_view;
    private ImageView photo;
    private String eventType;
    private Bundle extras;
    private String title;
    private String icon;
    private String description;
    private ImageButton mapButton;
    //private GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.g_map));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        title_view = (TextView) findViewById(R.id.event_detail_title);
        description_view = (TextView) findViewById(R.id.event_detail_description);
        photo = (ImageView) findViewById(R.id.photoID);

        mapButton = (ImageButton) findViewById(R.id.map_image);

        extras = getIntent().getExtras();

        title = extras.getString("title");
        description = extras.getString("details");
        icon = extras.getString("icon");
        eventType = extras.getString("type");

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/HelveticaNeueLTStd_Bd.otf");
        title_view.setTypeface(tf);

        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/HelveticaNeueLTStd_Lt.otf");
        description_view.setTypeface(tf1);




        title_view.setText(title);
        description_view.setText(description);

        if(extras.getString("icon").equals("pet")){
            photo.setImageResource(R.drawable.petevent_1);
        }else if(extras.getString("icon").equals("food")){
            photo.setImageResource(R.drawable.foodbank_1);
        }else if(extras.getString("icon").equals("blood")){
            photo.setImageResource(R.drawable.blooddrive_1);
        }else if(extras.getString("icon").equals("natural")){
            photo.setImageResource(R.drawable.flood_1);
        }else{

        }


        final String longitude = "30.269650";
        final String latitude ="-97.760140";


        final String uri = String.format("geo:0,0?q=" + latitude+ "," + longitude);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(mapIntent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
