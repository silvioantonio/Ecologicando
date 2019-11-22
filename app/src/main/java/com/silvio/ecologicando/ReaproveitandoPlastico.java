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
import com.silvio.ecologicando.model.GarrafasDecoracao;
import com.silvio.ecologicando.model.GarrafasEstufa;
import com.silvio.ecologicando.model.GarrafasOrganizador;
import com.silvio.ecologicando.model.GarrafasVasos;
import com.silvio.ecologicando.model.Ovos;
import com.silvio.ecologicando.model.Plastico;

public class ReaproveitandoPlastico extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaproveitando_plastico);

        imageView = findViewById(R.id.logo);
        navigationView = findViewById(R.id.navigationView3);

        Fragment fragmentReaproveitandoPlastico = Plastico.newInstance();
        openFragment(fragmentReaproveitandoPlastico);

        navigationView.setOnNavigationItemSelectedListener(this);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReaproveitandoPlastico.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container3, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navegacao_plastico: {
                //getSupportActionBar().setTitle("Banana");
                Fragment plastico = Plastico.newInstance();
                openFragment(plastico);
                break;
            }
            case R.id.navegacao_decoracao: {
                //getSupportActionBar().setTitle("Banana");
                Fragment decoracao = GarrafasDecoracao.newInstance();
                openFragment(decoracao);
                break;
            }case R.id.navegacao_estufa: {
                //getSupportActionBar().setTitle("Ovos");
                Fragment estufa = GarrafasEstufa.newInstance();
                openFragment(estufa);
                break;
            }case R.id.navegacao_organizador:{
                //getSupportActionBar().setTitle("Cafe");
                Fragment organizador = GarrafasOrganizador.newInstance();
                openFragment(organizador);
                break;
            }
            case R.id.navegacao_vasos:{
                //getSupportActionBar().setTitle("Cafe");
                Fragment vasos = GarrafasVasos.newInstance();
                openFragment(vasos);
                break;
            }
        }
        return true;
    }
}
