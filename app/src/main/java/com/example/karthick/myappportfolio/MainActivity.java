package com.example.karthick.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /* Function to display the toast message */
    public void displayToast(View view){
        if(view.getId() == R.id.button_spotify_streamer)
            createToast(getString(R.string.spotify_streamer_toast_message)).show();
        else if(view.getId() == R.id.button_scores_app)
            createToast(getString(R.string.scores_app_toast_message)).show();
        else if(view.getId() == R.id.button_library_app)
            createToast(getString(R.string.library_app_toast_message)).show();
        else if(view.getId() == R.id.button_build_it_bigger)
            createToast(getString(R.string.build_it_bigger_toast_message)).show();
        else if(view.getId() == R.id.button_xyz_reader)
            createToast(getString(R.string.xyz_reader_toast_message)).show();
        else if(view.getId() == R.id.button_capstone)
            createToast(getString(R.string.capstone_toast_message)).show();
    }



    /*Function to create a Toast with the message passed
     *
      * @param - toastMessage - the message to be displayed as toast
      * @return - the created Toast
      *
      * */
    private Toast createToast(CharSequence toastMessage){
        return Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
    }

}
