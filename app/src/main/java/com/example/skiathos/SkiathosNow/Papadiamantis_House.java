package com.example.skiathos.SkiathosNow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.skiathos.Maps.Papadiamantis_House_Loc;
import com.example.skiathos.R;

public class Papadiamantis_House extends AppCompatActivity {

    ImageView map;
    TextView map1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papadiamantis_house);


        map=(ImageView)findViewById(R.id.papadiamantis_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Papadiamantis_House.this, Papadiamantis_House_Loc.class);
                startActivity(intent);
            }
        });

        map1=(TextView) findViewById(R.id.papadiamantis_house_map_txt);
        map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Papadiamantis_House.this, Papadiamantis_House_Loc.class);
                startActivity(intent);
            }
        });
    }

}