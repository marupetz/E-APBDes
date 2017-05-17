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

public class AnggaranFragment extends Fragment {
    public AnggaranFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View vAnggran = inflater.inflate(R.layout.anggran,container,false);
        return vAnggran;
    }
}
