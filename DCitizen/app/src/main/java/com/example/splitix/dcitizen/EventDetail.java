package com.example.splitix.dcitizen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import org.w3c.dom.Text;

public class EventDetail extends AppCompatActivity {

    private final String address = "1156 W Cesar Chavez St, Austin, TX 78703";
    private TextView title_view;
    private TextView description_view;
    private String eventType;
    private Bundle extras;
    private String title;
    private String description;
    private ImageButton mapButton;
    //private GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.g_map));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        title_view = (TextView) findViewById(R.id.event_detail_title);
        description_view = (TextView) findViewById(R.id.event_detail_description);
        mapButton = (ImageButton) findViewById(R.id.map_image);

        extras = getIntent().getExtras();

        title = extras.getString("title");
        description = extras.getString("details");
        eventType = extras.getString("type");


        title_view.setText(title);
        description_view.setText(description);

        final String longitude = "30.269650";
        final String latitude ="-97.760140";


        final String uri = String.format("geo:0,0?q=" + address);

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
