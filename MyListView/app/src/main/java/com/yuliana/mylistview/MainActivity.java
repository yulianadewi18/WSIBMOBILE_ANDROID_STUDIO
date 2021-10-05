package com.yuliana.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView; //memanggil fungsi
    private Object AdapterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.day); // memanggil listview pada activity_main.xml
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.hari, android.R.layout.simple_list_item_1); // memanggil nama array dan layout viewnya
        listView.setAdapter(adapter); //menetapkan sebuah adapter pada baris sebelumnya
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
                String days = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(),"Hari"+days,Toast.LENGTH_SHORT).show(); //proses pesan saat di klik
            }
        });

    }
}


