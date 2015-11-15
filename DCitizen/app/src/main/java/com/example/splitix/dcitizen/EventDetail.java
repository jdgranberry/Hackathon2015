package com.example.splitix.dcitizen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import org.w3c.dom.Text;

public class EventDetail extends AppCompatActivity {

    private TextView title_view;
    private TextView description_view;
    private Bundle extras;
    private String title;
    private String description;
    //private GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.g_map));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        title_view = (TextView) findViewById(R.id.event_detail_title);
        description_view = (TextView) findViewById(R.id.event_detail_description);

        extras = getIntent().getExtras();

         title = extras.getString("title");
         description = extras.getString("details");

        title_view.setText(title);
        description_view.setText(description);



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
