package com.silvio.ecologicando;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class ToolbarFragment extends Fragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.share:
                Toast.makeText(getContext().getApplicationContext(),"share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(getContext().getApplicationContext(), "about", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                Toast.makeText(getContext().getApplicationContext(), "exit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(getContext().getApplicationContext(), "search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(getContext().getApplicationContext(), "setting", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

}
