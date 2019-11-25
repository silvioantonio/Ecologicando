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
import com.silvio.ecologicando.model.Alimento;
import com.silvio.ecologicando.model.AlimentosAzeiteCitrico;
import com.silvio.ecologicando.model.AlimentosBatatasFritas;
import com.silvio.ecologicando.model.AlimentosEspanteMosquitos;
import com.silvio.ecologicando.model.AlimentosLimpeza;

public class ReaproveitandoAlimentos extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaproveitando_alimentos);
        imageView = findViewById(R.id.logo);
        navigationView = findViewById(R.id.navigationView2);

        Fragment fragmentReaproveitandoAlimentos = Alimento.newInstance();
        openFragment(fragmentReaproveitandoAlimentos);

        navigationView.setOnNavigationItemSelectedListener(this);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReaproveitandoAlimentos.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container2, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navegacao_alimentos: {
                //getSupportActionBar().setTitle("Banana");
                Fragment alimento = Alimento.newInstance();
                openFragment(alimento);
                break;
            }
            case R.id.navegacao_limpeza: {
                //getSupportActionBar().setTitle("Banana");
                Fragment limpeza = AlimentosLimpeza.newInstance();
                openFragment(limpeza);
                break;
            }case R.id.navegacao_espante_mosquitos: {
                //getSupportActionBar().setTitle("Ovos");
                Fragment espante = AlimentosEspanteMosquitos.newInstance();
                openFragment(espante);
                break;
            }case R.id.navegacao_azeite:{
                //getSupportActionBar().setTitle("Cafe");
                Fragment azeite = AlimentosAzeiteCitrico.newInstance();
                openFragment(azeite);
                break;
            }
            case R.id.navegacao_batatas:{
                //getSupportActionBar().setTitle("Cafe");
                Fragment batatas = AlimentosBatatasFritas.newInstance();
                openFragment(batatas);
                break;
            }
        }
        return true;
    }
}
