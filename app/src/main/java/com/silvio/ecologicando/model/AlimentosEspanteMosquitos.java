package com.silvio.ecologicando.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.silvio.ecologicando.R;

public class AlimentosEspanteMosquitos extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_espante_mosquitos, container, false);
    }

    public static AlimentosEspanteMosquitos newInstance() {
        return new AlimentosEspanteMosquitos();
    }
}
