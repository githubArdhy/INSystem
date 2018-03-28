package com.insystem.insystem.Survey;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.insystem.insystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SurveyFragment extends Fragment {
    private static final String TAG = "SurveyFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_survey, container, false);

        return view;
    }
}
