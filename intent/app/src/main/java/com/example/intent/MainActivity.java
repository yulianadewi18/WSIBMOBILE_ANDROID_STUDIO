package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Implicit Intent
    // Intent socmed yang digunakan untuk melihat social media admin
    public void instagram(View view) {
        String url = "https://www.instagram.com/yln.dewi/" ;
        Intent instagram = new Intent(Intent. ACTION_VIEW);
        instagram.setData(Uri. parse(url));
        startActivity(instagram);
    }

    // Intent whatsapp yang digunakan untuk chat admin melalui whatsapp
    public void whatsapp(View view) {
        String url = "https://wa.me/6285775865683" ;
        Intent whatsapp = new Intent(Intent. ACTION_VIEW);
        whatsapp.setData(Uri. parse(url));
        startActivity(whatsapp);
    }

    // Explicit Intent
    public void about(View view) {
        Intent Detail= new Intent(MainActivity.this, Detail.class);
        startActivity(Detail);
    }
}