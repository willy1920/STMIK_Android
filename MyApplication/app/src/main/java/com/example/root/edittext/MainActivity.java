package com.example.root.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button okButton;
    EditText text;
    String kalimat;
    Kurs kurs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        okButton = (Button) findViewById(R.id.okButton);
        text = (EditText) findViewById(R.id.text1);

        kurs = new Kurs();

        kalimat = "Hello " + kurs.Rupiah(123456789);
        okButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View view){
                Toast.makeText(getApplicationContext(), kalimat + text.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
