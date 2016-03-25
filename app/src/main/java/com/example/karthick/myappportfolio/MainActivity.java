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

    /* Function to display the toast message */
    public void displayToast(View view){
        /*Get the toast message which is set as tag in the button view,
         * create the toast
          * and display it*/
        createToast(view.getTag().toString()).show();
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
