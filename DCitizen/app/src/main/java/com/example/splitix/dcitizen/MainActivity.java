package com.example.splitix.dcitizen;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ListView listView;
    private CustomListViewAdapter customListViewAdapter;
    private String sampleText = "Lorem ipsum dolor sit amet, duo tale principes sadipscing ei." +
            " No cibo nemore impedit mei, primis putent virtute pro no, modus paulo cetero et est." +
            " Mea agam gloriatur an";
    private String animalText = "We are looking for volunteers for our\n" +
            "monthly adoption events. We need volunteers who have a passion for animals and want" +
            " to see them go to good homes. If you would like to join our group sign up and send" +
            " us an email!";
    private String naturalText = "Help the vicitims of the recent flooding" +
                                 "in San Marcos and surrounding areas.";
    private String bloodText = "Save a life, donate blood today!" +
                               "Sponsored by The American Red Cross.";
    private String foodText = "The holidays are almost here, " +
                              "donate food and toys to help families in need.";
    private String cleanText = "We are looking for volunteers to help " +
                               "clean up the San Marcos River!";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, EventSubmissionActivity.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        final String[] feedTitles = new String[]{
                "Help needed at Pet Shelter",
                "Food Bank Needs You!!",
                "Austin Pets Alive!",
                "Donate Blood Today",
                "Food Bank Donations",
                "River Cleanup",
                "Looking for help from pet people",
                "Help clean up the flooded areas",
                "Trash pick up by the river!"


        };

        final String[] feedPosts = new String[]{
                animalText,
                foodText,
                animalText,
                bloodText,
                foodText,
                cleanText,
                animalText,
                naturalText,
                cleanText

        };

        final String[] feedIcons = new String[]{
                "pet",
                "food",
                "pet",
                "blood",
                "food",
                "comm",
                "pet",
                "natural",
                "comm",

        };

        ArrayList<HashMap<String, String>> feedList = new ArrayList<>();


        for (int i = 0; i < feedTitles.length; i++){
            HashMap<String, String> data = new HashMap<>();
            data.put("title", feedTitles[i]);
            data.put("post", feedPosts[i]);
            data.put("icon", feedIcons[i]);

            feedList.add(data);
        }

        listView = (ListView) findViewById(R.id.list);

        //Setup Adapter
        customListViewAdapter = new CustomListViewAdapter(getApplicationContext(), feedList);

        listView.setAdapter(customListViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemClickId = listView.getItemAtPosition(position).toString();

                String title = feedTitles[position];
                String detail = feedPosts[position];
                String iconImage = feedIcons[position];

                Intent detailedIntent = new Intent(MainActivity.this, EventDetail.class);
                detailedIntent.putExtra("title", title );
                detailedIntent.putExtra("details", detail);
                detailedIntent.putExtra("icon", iconImage);
                startActivity(detailedIntent);


            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camara) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {


        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
