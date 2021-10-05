package com.example.myautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] KOTA = new String[]{ //Daftar Item Menggunakan Array
            "Aceh", " Sumatra Utara", " Sumatra Barat", "Riau", " Kepulauan Riau", "Jambi", "Bengkulu", "Sumatera Selatan ", "Lampung ", "Bangka Belitung"
            , "Banten", "DKI Jakarta", "Jawa Barat ", "Jawa Tengah","DI Yogyakarta ","Jawa timur","Bali","Nusa Tenggara Timur", "Nusa Tenggara Barat",
            "Gorontalo","Sulawesi Barat", "Sulawesi Tengah", "Sulawesi utara","Sulawesi Tenggara","Sulawesi Selatan", "Maluku","Maluku utara","Papua","Papua Barat"
    };

    AutoCompleteTextView autocompletekota;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //memanggil implementasi superclass dari metode ini
        super.onCreate(savedInstanceState); //untuk menjalankan kode selain kode yang ada di kelas induk.
        setContentView(R.layout.activity_main); //untuk menyetel tata letak xml

        autocompletekota = findViewById(R.id.autocompletekota); // memanggil listview pada activity_main.xml

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, KOTA); // memanggil nama array dan layout viewnya
        autocompletekota.setAdapter(adapter); //menetapkan sebuah adapter pada baris sebelumnya
    }
}