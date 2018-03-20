package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<TourGuide> tour = new ArrayList<TourGuide>();
        tour.add(new TourGuide(getString(R.string.mall1

        ), getString(R.string.md1)));
        tour.add(new TourGuide(getString(R.string.mall2), getString(R.string.md2)));
        tour.add(new TourGuide(getString(R.string.mall3), getString(R.string.md3)));
        tour.add(new TourGuide(getString(R.string.mall4), getString(R.string.md4)));
        tour.add(new TourGuide(getString(R.string.mall5), getString(R.string.md5)));
        tour.add(new TourGuide(getString(R.string.mall6), getString(R.string.md6)));

        TourGuideAdapter adapter = new TourGuideAdapter(this, tour);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
