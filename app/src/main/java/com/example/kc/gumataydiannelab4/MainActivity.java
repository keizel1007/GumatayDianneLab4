 package com.example.kc.gumataydiannelab4;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ith","OnCreate() has executed" );
    }

     @Override
     protected void onStart() {
         super.onStart();
         Log.d("4ith", "onStart() has executed");
     }


     @Override
     protected void onResume() {
         super.onResume();
         Log.d("4ith", "onResume()has executed");
     }


     @Override
     protected void onStop() {
         super.onStop();
         Log.d("4ith", "onStop() has executed...");
     }


     @Override
     protected void onPause() {
         super.onPause();
         Log.d("4ith", "onPause() has executed...");
     }

     @Override
     protected void onRestart() {
         super.onRestart();
         Log.d("4ith", "onRestart() has executed...");
     }

     @Override
     protected void onDestroy() {
         super.onDestroy();
         Log.d("4ith", "onDestroy() has executed");
     }



     public void process(View v){

         if(v.getId()==R.id.btnNext){
             Snackbar.make(v,"SNACKBAR Message",Snackbar.LENGTH_LONG).show();
         } else if (v.getId()== R.id.btnBack){
             Toast.makeText(this,"TOAST Message",Toast.LENGTH_LONG).show();
         }

     }







 }
