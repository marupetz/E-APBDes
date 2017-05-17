package com.android.e_apbdes.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.e_apbdes.R;

/**
 * Created by Marupet'z on 5/17/2017.
 */

public class ProfilFragment extends Fragment {

    public ProfilFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View vProfil = inflater.inflate(R.layout.profil,container,false);
        return vProfil;
    }
}
