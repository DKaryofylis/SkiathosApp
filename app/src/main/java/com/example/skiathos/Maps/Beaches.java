package com.example.skiathos.Maps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.skiathos.Dashboard.Dashboard;
import com.example.skiathos.Maps.all_beaches.Agia_Paraskeui;
import com.example.skiathos.Maps.all_beaches.Agkistros;
import com.example.skiathos.Maps.all_beaches.Aselinos;
import com.example.skiathos.Maps.all_beaches.Koukounaries;
import com.example.skiathos.Maps.all_beaches.Krifi_Ammos;
import com.example.skiathos.Maps.all_beaches.Mandraki_Elias;
import com.example.skiathos.Maps.all_beaches.Mandraki_Xerxis;
import com.example.skiathos.Maps.all_beaches.Sklithri;
import com.example.skiathos.R;

public class Beaches extends AppCompatActivity {

    ImageView mandraki_elias, mandraki_xerxis, koukounaries, agia_paraskeui, krifi_ammos, sklithri, aselinos, agkistros,back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);

        back_button = (ImageView) findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Beaches.this, Dashboard.class);
                startActivity(intent);
            }
        });

        koukounaries = (ImageView) findViewById(R.id.koukounaries);
        koukounaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Koukounaries();
            }
        });

        mandraki_elias = (ImageView) findViewById(R.id.mandraki_elias);
        mandraki_elias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mandraki_Elias();
            }
        });

        mandraki_xerxis = (ImageView) findViewById(R.id.mandraki_xerxis);
        mandraki_xerxis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mandraki_Xerxis();
            }
        });

        agia_paraskeui = (ImageView) findViewById(R.id.agia_paraskeui);
        agia_paraskeui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Agia_Paraskeui();
            }
        });

        agkistros = (ImageView) findViewById(R.id.agkistros);
        agkistros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Agkistros();
            }
        });

        krifi_ammos = (ImageView) findViewById(R.id.krifi_ammos);
        krifi_ammos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Krifi_Ammos();
            }
        });

        sklithri = (ImageView) findViewById(R.id.sklithri);
        sklithri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sklithri();
            }
        });

        aselinos = (ImageView) findViewById(R.id.aselinos);
        aselinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aselinos();
            }
        });
    }


    public void Mandraki_Xerxis() {
        Intent intent = new Intent(Beaches.this, Mandraki_Xerxis.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, mandraki_xerxis, ViewCompat.getTransitionName(mandraki_xerxis));
        startActivity(intent, optionsCompat.toBundle());
    }

    public void Mandraki_Elias() {
        Intent intent = new Intent(Beaches.this, Mandraki_Elias.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, mandraki_elias, ViewCompat.getTransitionName(mandraki_elias));
        startActivity(intent, optionsCompat.toBundle());
    }

    public void Koukounaries() {
        Intent intent = new Intent(Beaches.this, Koukounaries.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, koukounaries, ViewCompat.getTransitionName(koukounaries));
        startActivity(intent, optionsCompat.toBundle());
    }

    public void Agkistros() {

        Intent intent = new Intent(Beaches.this, Agkistros.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, agkistros, ViewCompat.getTransitionName(agkistros));
        startActivity(intent, optionsCompat.toBundle());
    }

    public void Agia_Paraskeui() {
        Intent intent = new Intent(Beaches.this, Agia_Paraskeui.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, agia_paraskeui, ViewCompat.getTransitionName(agia_paraskeui));
        startActivity(intent, optionsCompat.toBundle());
    }

    public void Krifi_Ammos() {
        Intent intent = new Intent(Beaches.this, Krifi_Ammos.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, krifi_ammos, ViewCompat.getTransitionName(krifi_ammos));
        startActivity(intent, optionsCompat.toBundle());
    }

    public void Sklithri() {
        Intent intent = new Intent(Beaches.this, Sklithri.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, sklithri, ViewCompat.getTransitionName(sklithri));
        startActivity(intent, optionsCompat.toBundle());
    }

    public void Aselinos() {
        Intent intent = new Intent(Beaches.this, Aselinos.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Beaches.this, aselinos, ViewCompat.getTransitionName(aselinos));
        startActivity(intent, optionsCompat.toBundle());
    }
}