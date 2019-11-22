package com.silvio.ecologicando.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.silvio.ecologicando.R;

public class Adubo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_adubo, container, false);
    }

    public static Adubo newInstance() {
        return new Adubo();
    }

}
