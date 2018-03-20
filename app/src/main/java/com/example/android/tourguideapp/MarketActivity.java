package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<TourGuide> tour = new ArrayList<TourGuide>();
        tour.add(new TourGuide(getString(R.string.mkt1), getString(R.string.mktd1)));
        tour.add(new TourGuide(getString(R.string.mkt2), getString(R.string.mktd2)));
        tour.add(new TourGuide(getString(R.string.mkt3), getString(R.string.mktd3)));
        tour.add(new TourGuide(getString(R.string.mkt4), getString(R.string.mktd4)));
        TourGuideAdapter adapter = new TourGuideAdapter(this, tour);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
