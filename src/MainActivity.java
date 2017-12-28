package com.project.mif.calculateproj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


//    Button bkalku, bdatar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//       bkalku = (Button) findViewById


    public void bkalku (View v)
    {
        Intent intent = new Intent(MainActivity.this, calculator_main.class);
        startActivity(intent);
    }

    public void btnbdatar(View view) {
        Intent intent = new Intent(MainActivity.this,bangundatar.class);
        startActivity(intent);
    }

    public void btclose(View view) {
        moveTaskToBack(true);
    }


//    public void close(){
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage("Apakah Anda Benar-Benar ingin keluar?")
//                .setCancelable(false)
//                .setPositiveButton("Ya",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog,
//                                                int id) {
//                                ButtonExit.this.finish();
//                            }
//                        })
//                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog,
//                                        int id) {
//                        dialog.cancel();
//
//                    }
//                }).show();
//    }
//
//
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            close();
//
//        }
//        return super.onKeyDown(keyCode, event);
//    }
//}



}
