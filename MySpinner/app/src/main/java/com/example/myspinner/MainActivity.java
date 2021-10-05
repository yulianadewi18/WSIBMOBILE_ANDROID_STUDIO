package com.example.myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner; //memanggil fungsi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner); //Mendapatkan id dari spinner memanggil resourece dari item dan membuat adapter untuk spinner

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item); // memanggil nama array dan layout viewnya
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //untuk menetapkan tata letak yang harus digunakan adaptor untuk menampilkan daftar pilihan spinner dan tata letak standar lainnya yang telah ditetapkan
        spinner.setAdapter(adapter); //menetapkan sebuah adapter pada baris sebelumnya

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //implementasikan antarmuka
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(parent.getContext(),"Pilih planet: "+parent.getItemIdAtPosition(position), Toast.LENGTH_SHORT).show(); //proses pesan saat di klik
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}