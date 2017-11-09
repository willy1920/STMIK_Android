package com.example.rzl.spinnerbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTanggalSpinner();
    }

    private void initTanggalSpinner(){
        List<String> tanggalList = new ArrayList<String>();
        int maksimal = 31;
        for(int i = 1; i <= maksimal; i++){
            tanggalList.add(String.valueOf(i));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tanggalList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        Spinner tanggalSpinner  = (Spinner)findViewById(R.id.abc);
        tanggalSpinner.setAdapter(arrayAdapter);
    }
}
