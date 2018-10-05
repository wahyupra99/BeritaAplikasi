package com.gambar.iput.quizandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void readMore1(View view) {
        Intent intent = new Intent(this, Berita1.class);
        startActivity(intent);
    }
    public void readMore2(View view) {
        Intent intent = new Intent(this, Berita2.class);
        startActivity(intent);
    }
    public void readMore3(View view) {
        Intent intent = new Intent(this, Berita3.class);
        startActivity(intent);
    }
    public void readMore4(View view) {
        Intent intent = new Intent(this, Berita4.class);
        startActivity(intent);
    }
}
