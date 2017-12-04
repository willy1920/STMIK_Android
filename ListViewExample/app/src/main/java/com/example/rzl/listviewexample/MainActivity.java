package com.example.rzl.listviewexample;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity{
    private List<String> buahList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        initBuahList();
        initListView();
    }

    private void initListView() {
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, buahList));

        ListView listView = getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String buah = getListAdapter().getItem(position).toString();
                String pesan = "Anda memilih buah : " + buah;
                Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initBuahList(){
        buahList = new ArrayList<>();

        buahList.add("Nanas");
        buahList.add("Durian");
        buahList.add("Semangka");
        buahList.add("Mangga");
        buahList.add("Kelapa");
        buahList.add("Apel");
        buahList.add("Alpukat");
        buahList.add("Buah Naga");
        buahList.add("Belimbing");
        buahList.add("Sirsak");
        buahList.add("Rambutan");
        buahList.add("Pisang");
    }
}
