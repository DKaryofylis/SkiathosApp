package com.example.skiathos.Maps;

import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.skiathos.R;
import com.example.skiathos.SkiathosNow.SkiathosTown;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bus_Route extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    FloatingActionButton add_float_btn, default_float_btn, terrain_float_btn, satellite_float_btn;

    Animation openRotation, closeRotation, from_right_btn, to_right_btn;
    private boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_route);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        openRotation = AnimationUtils.loadAnimation(this, R.anim.open_rotation_btn);
        closeRotation = AnimationUtils.loadAnimation(this, R.anim.close_rotation_btn);
        from_right_btn = AnimationUtils.loadAnimation(this, R.anim.from_right_btn);
        to_right_btn = AnimationUtils.loadAnimation(this, R.anim.to_right_btn);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng skiathos = new LatLng(39.16916179441238, 23.451385269427774);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(skiathos, 12), 10, null);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        LatLng skiathos_port = new LatLng(39.165587111168286, 23.492098841008733);
        mMap.addMarker(new MarkerOptions().position(skiathos_port).title("Skiathos Port"));


        LatLng bus_station = new LatLng(39.165587111168286, 23.492098841008733);
        mMap.addMarker(new MarkerOptions().position(bus_station).title("Bus Station - Skiathos City"));


//        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
//            @Override
//            public boolean onMarkerClick(Marker marker) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(Bus_Route.this);
//                builder.setMessage("You will be transfered to Skiathos Town Page\nWould you like to proceed?");
//                builder.setCancelable(true);
//
//                builder.setPositiveButton(
//                        "Yes",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                SkiathosTown();
//                                dialog.cancel();
//                            }
//                        });
//
//                builder.setNegativeButton(
//                        "No",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                dialog.cancel();
//                            }
//                        });
//
//                AlertDialog alert = builder.create();
//                alert.show();
//
//                Intent intent = new Intent(Bus_Route.this, Bus_Stop_4.class);
//                startActivity(intent);
//
//                return false;
//            }
//        });


        LatLng delta = new LatLng(39.169134, 23.492047);
        mMap.addMarker(new MarkerOptions().position(delta).title("Delta (Bus Stop #1)"));

        LatLng platania_karpeti = new LatLng(39.173099, 23.488464);
        mMap.addMarker(new MarkerOptions().position(platania_karpeti).title("Platania Karpeti (Bus Stop #2)"));

        LatLng sfageia = new LatLng(39.167733, 23.484993);
        mMap.addMarker(new MarkerOptions().position(sfageia).title("Sfageia (Bus Stop #3)"));

        LatLng akropoli = new LatLng(39.163638, 23.482418);
        mMap.addMarker(new MarkerOptions().position(akropoli).title("Akropolis (Bus Stop #4)"));

        LatLng megali_ammos = new LatLng(39.162007, 23.476589);
        mMap.addMarker(new MarkerOptions().position(megali_ammos).title("Megali Ammos (Bus Stop #5)"));

        LatLng mitikas = new LatLng(39.159019, 23.473309);
        mMap.addMarker(new MarkerOptions().position(mitikas).title("Mitikas (Bus Stop #6)"));

        LatLng mikros_vasilias = new LatLng(39.155227, 23.470041);
        mMap.addMarker(new MarkerOptions().position(mikros_vasilias).title("Mikros Vasilias (Bus Stop #7)"));

        LatLng megalos_vasilias = new LatLng(39.153703, 23.467214);
        mMap.addMarker(new MarkerOptions().position(megalos_vasilias).title("Megalos Vasilias (Bus Stop #8)"));

        LatLng agios_taxiarches = new LatLng(39.150056488765024, 23.465832088662843);
        mMap.addMarker(new MarkerOptions().position(agios_taxiarches).title("Agios Taxiarches (Bus Stop #9)"));

        LatLng achladies = new LatLng(39.147845, 23.460947);
        mMap.addMarker(new MarkerOptions().position(achladies).title("Achladies (Bus Stop #10)"));

        LatLng sklithri = new LatLng(39.142904, 23.460902);
        mMap.addMarker(new MarkerOptions().position(sklithri).title("Sklithri (Bus Stop #11)"));

        LatLng kanapitsa = new LatLng(39.140476, 23.454732);
        mMap.addMarker(new MarkerOptions().position(kanapitsa).title("Kanapitsa/Tzaneria/Nostos (Bus Stop #12)"));

        LatLng vromolimnos = new LatLng(39.139881799283664, 23.45262505139681);
        mMap.addMarker(new MarkerOptions().position(vromolimnos).title("Vromolimnos (Bus Stop #13)"));

        LatLng kolios = new LatLng(39.141438, 23.447885);
        mMap.addMarker(new MarkerOptions().position(kolios).title("Kolios (Bus Stop #14)"));

        LatLng makri_katalima = new LatLng(39.142711, 23.444640);
        mMap.addMarker(new MarkerOptions().position(makri_katalima).title("Makri Katalima (Bus Stop #15)"));

        LatLng agia_paraskevi = new LatLng(39.144322, 23.438718);
        mMap.addMarker(new MarkerOptions().position(agia_paraskevi).title("Agia Paraskevi (Bus Stop #16)"));

        LatLng poros = new LatLng(39.142176, 23.432422);
        mMap.addMarker(new MarkerOptions().position(poros).title("Poros (Bus Stop #17)"));

        LatLng troulos_crossroad = new LatLng(39.141756, 23.427659);
        mMap.addMarker(new MarkerOptions().position(troulos_crossroad).title("Troulos Crossroad (Bus Stop #18)"));

        LatLng troulos_gas_station = new LatLng(39.142642, 23.423996);
        mMap.addMarker(new MarkerOptions().position(troulos_gas_station).title("Troulos Gas Station (Bus Stop #19)"));

        LatLng troulos_beach = new LatLng(39.14217129418145, 23.420605133864562);
        mMap.addMarker(new MarkerOptions().position(troulos_beach).title("Troulos Beach (Bus Stop #20)"));

        LatLng amoni = new LatLng(39.141727, 23.414500);
        mMap.addMarker(new MarkerOptions().position(amoni).title("Amoni (Bus Stop #21)"));

        LatLng maratha = new LatLng(39.147165, 23.407741);
        mMap.addMarker(new MarkerOptions().position(maratha).title("Maratha (Bus Stop #22)"));

        LatLng mandraki = new LatLng(39.152521, 23.405305);
        mMap.addMarker(new MarkerOptions().position(mandraki).title("Mandraki (Bus Stop #23)"));

        LatLng strofilia = new LatLng(39.153087, 23.401218);
        mMap.addMarker(new MarkerOptions().position(strofilia).title("Strofilia (Bus Stop #24)"));

        LatLng agia_eleni = new LatLng(39.151713, 23.397947);
        mMap.addMarker(new MarkerOptions().position(agia_eleni).title("Agia Eleni (Bus Stop #25)"));

        LatLng koukounaries = new LatLng(39.14821653693152, 23.398343337391022);
        mMap.addMarker(new MarkerOptions().position(koukounaries).title("Koukounaries (Bus Stop #26)"));


        add_float_btn = findViewById(R.id.add_float_btn);
        add_float_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicked = !clicked;

                if (!clicked) {

                    default_float_btn.setVisibility(View.INVISIBLE);
                    default_float_btn.startAnimation(to_right_btn);
                    satellite_float_btn.setVisibility(View.INVISIBLE);
                    satellite_float_btn.startAnimation(to_right_btn);
                    terrain_float_btn.setVisibility(View.INVISIBLE);
                    terrain_float_btn.startAnimation(to_right_btn);
                    add_float_btn.startAnimation(closeRotation);

                } else {

                    default_float_btn.setVisibility(View.VISIBLE);
                    default_float_btn.startAnimation(from_right_btn);
                    satellite_float_btn.setVisibility(View.VISIBLE);
                    satellite_float_btn.startAnimation(from_right_btn);
                    terrain_float_btn.setVisibility(View.VISIBLE);
                    terrain_float_btn.startAnimation(from_right_btn);
                    add_float_btn.startAnimation(openRotation);
                }

            }
        });

        default_float_btn = findViewById(R.id.default_float_btn);
        default_float_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                Toast.makeText(getApplicationContext(), "Default", Toast.LENGTH_SHORT).show();
            }
        });

        terrain_float_btn = findViewById(R.id.terrain_float_btn);
        terrain_float_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                Toast.makeText(getApplicationContext(), "Terrain", Toast.LENGTH_SHORT).show();


            }
        });

        satellite_float_btn = findViewById(R.id.satellite_float_btn);
        satellite_float_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                Toast.makeText(getApplicationContext(), "Satellite", Toast.LENGTH_SHORT).show();
            }
        });
    }
}