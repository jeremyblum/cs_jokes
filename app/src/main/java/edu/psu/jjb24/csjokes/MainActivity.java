package edu.psu.jjb24.csjokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] joke_title;
    String[] joke_setup;
    String[] joke_punchline;
    int currentJoke = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the action bar
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        joke_title = getResources().getStringArray(R.array.JokeTitle);
        joke_setup = getResources().getStringArray(R.array.JokeSetup);
        joke_punchline = getResources().getStringArray(R.array.JokePunchline);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_joke:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}