package com.insystem.insystem.Buyer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.insystem.insystem.R;


/**
 * Created by HP on 2/18/2018.
 */

public class BuyerFragment extends Fragment {
    private static final String TAG = "BuyerFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buyer, container, false);
        return view;
    }
}
