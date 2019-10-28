package com.silvio.ecologicando;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.share:
                Toast.makeText(getApplicationContext(),"share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(getApplicationContext(), "about", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                Toast.makeText(getApplicationContext(), "exit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(getApplicationContext(), "search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(getApplicationContext(), "setting", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

}
