package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<TourGuide> tour = new ArrayList<TourGuide>();
        tour.add(new TourGuide(getString(R.string.hotel1), getString(R.string.price1)));
        tour.add(new TourGuide(getString(R.string.hotel2), getString(R.string.price2)));
        tour.add(new TourGuide(getString(R.string.hotel3), getString(R.string.price3)));
        tour.add(new TourGuide(getString(R.string.hotel4), getString(R.string.price4)));
        tour.add(new TourGuide(getString(R.string.hotel5), getString(R.string.price5)));
        tour.add(new TourGuide(getString(R.string.hotel6), getString(R.string.price6)));

        TourGuideAdapter adapter = new TourGuideAdapter(this, tour);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
