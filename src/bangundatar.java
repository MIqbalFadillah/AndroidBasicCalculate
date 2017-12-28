package com.project.mif.calculateproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bangundatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangundatar);
    }

    public void LsegitigaKlik(View view) {
        Intent intent = new Intent(bangundatar.this,luassegitiga.class);
        startActivity(intent);
    }

    public void Lpanjang(View view) {
        Intent intent = new Intent(bangundatar.this,luaspersegipanjang.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(bangundatar.this,MainActivity.class);
        startActivity(intent);
    }
}
