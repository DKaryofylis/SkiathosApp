package com.example.skiathos.Maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.skiathos.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Papadiamantis_House_Loc extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papadiamantis__house__loc);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng papadiamantis_house = new LatLng(39.163064846568254, 23.490121713553854);
        mMap.addMarker(new MarkerOptions().position(papadiamantis_house).title("Papadiamantis House"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(papadiamantis_house, 17), 10, null);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}