package com.example.rzl.framelayoutquiz;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadHotelImageView();
    }

    private void loadHotelImageView() {
        ImageView hotelImage = (ImageView) findViewById(R.id.hotalImageView);
        String url = "https://www.safarihotelsnamibia.com/wp-content/uploads/2014/11/Safari-Court-Hotel-Pool.jpg";

        Picasso.with(this).load(url).into(hotelImage);

    }

}
