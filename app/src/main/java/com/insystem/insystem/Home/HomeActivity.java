package com.insystem.insystem.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.insystem.insystem.Buyer.BuyerFragment;
import com.insystem.insystem.Buyer.SectionsPagerAdapter;
import com.insystem.insystem.Listing.ListingFragment;
import com.insystem.insystem.LoginActivity;
import com.insystem.insystem.Profile.ProfileFragment;
import com.insystem.insystem.R;
import com.insystem.insystem.Survey.SurveyFragment;
import com.insystem.insystem.Tawar.TawarFragment;

public class HomeActivity extends AppCompatActivity {                                               // HomeActivity ialah subclass dari App

    private static final String TAG = "HomeActivity";                                               // Variable Class yg tidak berubah (final)
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {                                            // Method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Starting.");

        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentHome());
        adapter.addFragment(new TawarFragment());
        adapter.addFragment(new SurveyFragment());
        adapter.addFragment(new BuyerFragment());
        adapter.addFragment(new ListingFragment());
        adapter.addFragment(new ProfileFragment());
        ViewPager viewPager = findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.BottomPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_house);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_penawaran);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_survey);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_buyer);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_listing);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_profile);

        setImage();

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser == null) {
            Intent intentLogin = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intentLogin);
            finish();
        }
    }

    private void setImage() {
        imageView = findViewById(R.id.blenderTawar);
    }

}
