package com.example.managementfile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.managementfile.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {
    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showText = (TextView) findViewById(R.id.getText);
    }

    public void getPublic(View view) {
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);//folder name
        File myFile = new File(folder, "Dataku.txt");//Filename
        String text = getdata(myFile);
        if (text != null) {
            showText.setText(text);
        } else {
            showText.setText("No Data");
        }

    }

    private String getdata(File myFile) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(myFile);
            int i = -1;
            StringBuffer buffer = new StringBuffer();
            while ((i = fileInputStream.read()) != -1) {
                buffer.append((char) i);
            }
            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


    public void getPrivate(View view) {
        File folder = getExternalFilesDir("DEWDEW");//folder name
        File myFile = new File(folder,"Dataku juga.txt");// nama file
        String text = getdata(myFile);
        if(text != null){
            showText.setText(text);
        }else{
            showText.setText("No Data");
        }
    }

    public void back(View view) {
        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }
}
