package com.example.neo.coursecenterworkshop;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.example.neo.coursecenterworkshop.TheFragments.Tab1Fragment;
import com.example.neo.coursecenterworkshop.TheFragments.Tab2Fragment;
import com.example.neo.coursecenterworkshop.TheFragments.Tab3Fragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main3Activity extends AppCompatActivity {
    private static final String TAG = "Main3Activity";

    private SectionsPagerAdapter mSectionAdapter;

    private ViewPager mViewPager;

    public static FirebaseDatabase database;
    public static DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mSectionAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);

        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        database = FirebaseDatabase.getInstance();
        database.setPersistenceEnabled(true);


        myRef = database.getReference("CourseCenter");
        myRef.keepSynced(true);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(),"Home");
        adapter.addFragment(new Tab2Fragment(),"register");
        adapter.addFragment(new Tab3Fragment(),"registration");
        viewPager.setAdapter(adapter);

    }



}
