package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

    public void click(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("bye world!");
    }

    public void changeActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        MainActivity.this.startActivity(intent);
    }


}
