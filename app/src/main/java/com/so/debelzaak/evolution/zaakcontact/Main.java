package com.so.debelzaak.evolution.zaakcontact;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    public void phfonne(View view) {
        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        intent.putExtra(ContactsContract.Intents.Insert.EMAIL, "edebelzaakso@gmail.com");
        intent.putExtra(ContactsContract.Intents.Insert.NAME, "{E}DEBELZAAK S.O");
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, "+55 (33)998285010");
        startActivity(intent);
    }

    public void esite(View view) {
        Intent bacer = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edebelzaakso.com/"));
        startActivity(bacer);
    }

    public void eemail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + "edebelzaakso@gmail.com"));
        startActivity(Intent.createChooser(intent,"Enviar e-mail"));
    }

    public void apmais(View view) {
        Intent intentcjhghfj = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=5830168101610968765"));
        startActivity(intentcjhghfj);
    }

    public void maissd(View view) {
        Intent intentcjhghfj = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%7BE%7DDEBELZAAK+S.O"));
        startActivity(intentcjhghfj);
    }
}