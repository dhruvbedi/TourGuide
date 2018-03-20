package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<TourGuide> tour = new ArrayList<TourGuide>();
        tour.add(new TourGuide(getString(R.string.IndiaGate), getString(R.string.monument), R.drawable.indiagate));
        tour.add(new TourGuide(getString(R.string.QM),getString(R.string.monument), R.drawable.qutub));
        tour.add(new TourGuide(getString(R.string.LT),getString(R.string.monument), R.drawable.lotustemple));
        tour.add(new TourGuide(getString(R.string.AD),getString(R.string.monument), R.drawable.akshar));

        TourGuideAdapter adapter = new TourGuideAdapter(this, tour);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
