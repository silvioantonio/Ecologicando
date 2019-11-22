package com.silvio.ecologicando;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.silvio.ecologicando.model.Adubo;
import com.silvio.ecologicando.model.Banana;
import com.silvio.ecologicando.model.Cafe;
import com.silvio.ecologicando.model.Ovos;

public class CriandoSeuAdubo extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView navigationView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criando_seu_adubo);

        imageView = findViewById(R.id.logo);
        navigationView = findViewById(R.id.navigationView);

        Fragment fragmentAdubo = Adubo.newInstance();
        openFragment(fragmentAdubo);

        navigationView.setOnNavigationItemSelectedListener(this);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CriandoSeuAdubo.this, MainActivity.class);
                startActivity(i);
            }
        });

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
            case R.id.navegacao_adubo: {
                //getSupportActionBar().setTitle("Banana");
                Fragment fragmentAdubo = Adubo.newInstance();
                openFragment(fragmentAdubo);
                break;
            }
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
