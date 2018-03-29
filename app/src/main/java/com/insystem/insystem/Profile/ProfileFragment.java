package com.insystem.insystem.Profile;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.insystem.insystem.Activity.SettingActivity;
import com.insystem.insystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment { //How to add AppCompatActivity in Fragment class, How to add intent in fragment Activity, how to call activity in fragment

    ImageButton imageView;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vi = inflater.inflate(R.layout.fragment_profile, container, false);

        imageView = vi.findViewById(R.id.imageDotThreeButtonProfileMenu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCoba = new Intent(getActivity(), SettingActivity.class);
                startActivity(intentCoba);
            }
        });

        return vi;
    }


}
