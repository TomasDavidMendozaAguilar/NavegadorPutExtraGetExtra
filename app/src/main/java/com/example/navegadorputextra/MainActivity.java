package com.example.navegadorputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Buscador = (Button)findViewById(R.id.btnBuscar);
        EditText palabra = (EditText)findViewById(R.id.EditURL);


        Buscador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vi = palabra.getText().toString();

                Intent i = new Intent(MainActivity.this, navegadorwebver.class);

                i.putExtra("UrlVer", vi);
                 startActivity(i);

            }
        });

    }

}