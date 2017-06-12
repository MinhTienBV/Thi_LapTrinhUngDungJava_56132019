package com.example.nguyenminhtien.texttospeed;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText edtNoidung;
    Button btnSpeak;
    TextToSpeech toSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
        toolbar.setTitle("Text To Speed");

        edtNoidung = (EditText)findViewById(R.id.editText);
        btnSpeak = (Button)findViewById(R.id.button);
        btnSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String noidung = edtNoidung.getText().toString();

                toSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if(status != TextToSpeech.ERROR){
                            toSpeech.setLanguage(Locale.ENGLISH);
                            toSpeech.speak(noidung,TextToSpeech.QUEUE_FLUSH,null);

                        }

                    }
                });

            }
        });
    }
}
