package com.demo.weddingcardapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;





public final class LaucherActivityNew extends AppCompatActivity {


    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_laucher);
        new Thread() { 
            @Override 
            public void run() {
                try {
                    Thread.sleep(2000L);
                    LaucherActivityNew.this.startActivity(new Intent(LaucherActivityNew.this.getBaseContext(), MainActivity.class));
                    LaucherActivityNew.this.finish();
                } catch (Exception unused) {
                }
            }
        }.start();
    }
}
