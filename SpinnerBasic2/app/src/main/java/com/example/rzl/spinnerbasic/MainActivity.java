package com.example.rzl.spinnerbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rzl.spinnerbasic.model.Mahasiswa;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    private List<Mahasiswa> mahasiswaList;

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

    private void initDatabase(){
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        String url = "http://192.168.202.103/STMIK_Android/tampilMahasiswa.php";

        asyncHttpClient.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                getMahasiswaList(responseBody);
                inisialisasiNamaSpinner();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                TextView errorText = (TextView)findViewById(R.id.errorTextView);
                errorText.setText(error.getMessage());
            }
        });
    }
    private void getMahasiswaList(byte[] responseBody){
        Gson gson = new Gson();

        try{
            mahasiswaList = gson.fromJson(new String(responseBody), new TypeToken<List<Mahasiswa>>(){}.getType());
        }
        catch (Exception e){
            TextView errorTextView = (TextView)findViewById(R.id.errorTextView);
        }

    }

    private void inisialisasiNamaSpinner(){
        List<String> namaList = new ArrayList<String>();
        Mahasiswa mahasiswa;
        String nama;
        for(int mahasiswaIndex = 0; mahasiswaIndex < mahasiswaList.size(); mahasiswaIndex++){
            mahasiswa = mahasiswaList.get(mahasiswaIndex);
            nama = mahasiswa.getNama();
            namaList.add(nama);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, namaList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        Spinner namaSpinner = (Spinner)findViewById(R.id.abc);
        namaSpinner.setAdapter(arrayAdapter);
    }
}
