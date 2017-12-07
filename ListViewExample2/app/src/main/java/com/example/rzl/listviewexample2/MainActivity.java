package com.example.rzl.listviewexample2;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {
    private List<Buah> buahList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        initBuahList();
        initListView();
    }

    private void initListView() {
        setListAdapter(new BuahArrayAdapter(this, R.layout.activity_main, buahList));
    }

    private void initBuahList() {
        buahList = new ArrayList<>();
        Buah buah;

        buah = new Buah();
        buah.setNama("Nanas");
        buah.setVitamin("C");
        buah.setDeskripsi("Rasanya asam. Yang sakit maag dilarang makan buah ini!!");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Rambutan");
        buah.setVitamin("B");
        buah.setDeskripsi("Bentuknya bulan berbulu");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Jeruk");
        buah.setVitamin("C");
        buah.setDeskripsi("Bentuk bulat biasanya berwarna orange atau hijau");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Buah Naga");
        buah.setVitamin("A");
        buah.setDeskripsi("Bentuknya aneh berduri berwarna ungu");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Mangga");
        buah.setVitamin("C");
        buah.setDeskripsi("Bentuknya lonjong kulitnya berwarna orange terdapat biji ditengah-tengah buah");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Apel");
        buah.setVitamin("A");
        buah.setDeskripsi("Bentuk seperti hati berwarna merah keputihan");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Durian");
        buah.setVitamin("D");
        buah.setDeskripsi("Mempunyai kulit keras berduri");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Sirsak");
        buah.setVitamin("B");
        buah.setDeskripsi("Bentuknya gak jelask");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Lemon");
        buah.setVitamin("E");
        buah.setDeskripsi("Bentuk bola berwarna orange");
        buahList.add(buah);

        buah = new Buah();
        buah.setNama("Pepaya");
        buah.setVitamin("E");
        buah.setDeskripsi("Gampang ditanam dihalaman rumah");
        buahList.add(buah);
    }
}
