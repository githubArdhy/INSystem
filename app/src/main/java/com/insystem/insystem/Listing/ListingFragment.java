package com.insystem.insystem.Listing;


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
public class ListingFragment extends Fragment {

    ImageButton imageView;


    public ListingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vi = inflater.inflate(R.layout.fragment_listing, container, false);

        imageView = vi.findViewById(R.id.idImageInputListing);
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
