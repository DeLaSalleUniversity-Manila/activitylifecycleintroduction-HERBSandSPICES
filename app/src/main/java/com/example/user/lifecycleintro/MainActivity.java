package com.example.user.lifecycleintro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String logcat = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(logcat, "onCreate() has been called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(logcat, "onStart() has been called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(logcat, "onResume() has been called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(logcat, "onDestroy() has been called");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        Log.d(logcat, "onSaveInstanceState() has been called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(logcat, "onStop() has been called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(logcat, "onRestart() has been called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(logcat, "onDestroy() has been called");
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
}
