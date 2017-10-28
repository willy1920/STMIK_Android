package com.willy.implicitintent;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button telepon = (Button)findViewById(R.id.telepon);
        telepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teleponIntent = new Intent(Intent.ACTION_DIAL);
                String url = "tel:08985935425";
                Uri uri = Uri.parse(url);
                teleponIntent.setData(uri);

                startActivity(teleponIntent);
            }
        });

        Button kamera = (Button)findViewById(R.id.kamera);
        kamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(kameraIntent);
            }
        });

        Button video = (Button)findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivity(videoIntent);
            }
        });

        Button sms = (Button)findViewById(R.id.sms);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent smsIntent = new Intent(Intent.ACTION_MAIN);
                smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
                startActivity(smsIntent);
            }
        });

        Button galeri = (Button)findViewById(R.id.galeri);
        galeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galeriIntent = new Intent(Intent.ACTION_MAIN);
                galeriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
                startActivity(galeriIntent);
            }
        });

        Button email = (Button)findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_MAIN);
                emailIntent.addCategory(Intent.CATEGORY_APP_EMAIL);
                startActivity(emailIntent);
            }
        });

        Button browser = (Button)findViewById(R.id.browser);
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_MAIN);
                emailIntent.addCategory(Intent.CATEGORY_APP_BROWSER);
                startActivity(emailIntent);
            }
        });

        Button contacts = (Button)findViewById(R.id.contacts);
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(Intent.ACTION_MAIN);
                contactIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
                startActivity(contactIntent);
            }
        });

        Button calender = (Button)findViewById(R.id.calender);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calenderIntent = new Intent(Intent.ACTION_MAIN);
                calenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
                startActivity(calenderIntent);
            }
        });

        Button googlePlay = (Button)findViewById(R.id.googlePlay);
        googlePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googlePlayIntent = new Intent(Intent.ACTION_MAIN);
                googlePlayIntent.addCategory(Intent.CATEGORY_APP_MARKET);
                startActivity(googlePlayIntent);
            }
        });

        Button wifi = (Button)findViewById(R.id.wifi);
        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wifiIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(wifiIntent);
            }
        });
    }
}
