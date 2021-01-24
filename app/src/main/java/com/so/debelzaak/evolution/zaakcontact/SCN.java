package com.so.debelzaak.evolution.zaakcontact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SCN extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scn);

    Handler handler = new Handler();
        handler.postDelayed(this, 3000);
}

    public void run(){
         Intent intenffFF = new Intent(SCN.this,Main.class);
         startActivity(intenffFF);
         finish();
    }
}
