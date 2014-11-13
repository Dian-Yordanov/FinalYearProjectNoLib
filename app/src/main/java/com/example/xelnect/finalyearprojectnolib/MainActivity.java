package com.example.xelnect.finalyearprojectnolib;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import java.io.File;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option1:
                //ContextWrapper c = new ContextWrapper(this);
                String path = Environment.getExternalStorageDirectory() + "/Pictures";
                Log.d("Files", "Path: " + path);
                File ff = new File(path);
                File file[] = ff.listFiles();
                Log.d("Files", "Size: " + file.length);
                for (int i = 0; i < file.length; i++) {
                    Log.d("Files", "FileName:" + file[i].getName());
                }
                return true;
            case R.id.option2:
                Toast.makeText(getApplicationContext(), "Sample Text2", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
