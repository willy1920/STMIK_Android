package com.example.rzl.spinnerkuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rzl.spinnerkuis.Model.Mahasiswa;
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

        initDatabase();
    }

    private void initDatabase(){
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        String url = "http://192.168.202.119/STMIK_Android/tampilMahasiswa.php";

        asyncHttpClient.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                getMahasiswaList(responseBody);
                initSpinner();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                TextView textView = (TextView)findViewById(R.id.error);
                textView.setText(error.getMessage());
            }
        });
    }

    private void getMahasiswaList(byte[] responsebody){
        Gson gson = new Gson();

        try{
            mahasiswaList = gson.fromJson(new String(responsebody), new TypeToken<List<Mahasiswa>>(){}.getType());
        }
        catch (Exception e){
            TextView error = (TextView)findViewById(R.id.error);
            error.setText(e.toString());
        }
    }

    private void initSpinner(){
        List<String> namaList = new ArrayList<String>();
        Mahasiswa mahasiswa;
        String nama;
        for (int i=0; i < mahasiswaList.size(); i++){
            mahasiswa = mahasiswaList.get(i);
            nama = mahasiswa.getNama();
            namaList.add(nama);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, namaList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(arrayAdapter);

    }
}
