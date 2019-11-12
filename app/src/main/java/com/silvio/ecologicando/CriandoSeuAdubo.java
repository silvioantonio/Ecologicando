package com.silvio.ecologicando;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CriandoSeuAdubo extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criando_seu_adubo);

        navigationView = findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navegacao_banana: {
                //getSupportActionBar().setTitle("Banana");
                Fragment fragmentBanana = Banana.newInstance();
                openFragment(fragmentBanana);
                break;
            }case R.id.navegacao_ovos: {
                //getSupportActionBar().setTitle("Ovos");
                Fragment fragmentOvos = Ovos.newInstance();
                openFragment(fragmentOvos);
                break;
            }case R.id.navegacao_cafe:{
                //getSupportActionBar().setTitle("Cafe");
                Fragment fragmentCafe = Cafe.newInstance();
                openFragment(fragmentCafe);
                break;
            }
        }
        return true;
    }
}
