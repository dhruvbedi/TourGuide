package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView attractions = (TextView) findViewById(R.id.attractions);
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AttractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(AttractionsIntent);
            }
        });

        TextView markets = (TextView) findViewById(R.id.markets);
        markets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MarketsIntent = new Intent(MainActivity.this, MarketActivity.class);
                startActivity(MarketsIntent);
            }
        });

        TextView malls = (TextView) findViewById(R.id.malls);
        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MallsIntent = new Intent(MainActivity.this, MallsActivity.class);
                startActivity(MallsIntent);
            }
        });

        TextView hotels = (TextView) findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(HotelsIntent);
            }
        });
    }
}
