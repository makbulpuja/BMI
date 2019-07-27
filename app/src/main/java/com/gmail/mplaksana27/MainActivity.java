package com.gmail.mplaksana27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*    Button
              btnHitung;
      @Override
      protected void
      onCreate(Bundle savedInstanceState) {

          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          getSupportActionBar().hide();
          //inisialisasi variabel

          btnHitung = (Button)findViewById(R.id.button);
          //set on click listener pada button

          btnHitung.setOnClickListener(new View.OnClickListener() {

              @Override
              public void onClick(View view) {

              }

          });
      }
  */
    @Override
    protected void
    onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.
                activity_main);
        getSupportActionBar().hide();
    }

    public void tentang(View view) {
        Toast.makeText(MainActivity.this,"Ini Layout Tentang", Toast.LENGTH_SHORT).show();
    }

    public void hitung(View view) {
        Intent intent = new Intent(MainActivity.this,HitungActivity.class);
        startActivity(intent);
    }
}
