package com.example.skiathos.Dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.skiathos.Adapters.Most_Popular_Adapter;
import com.example.skiathos.Adapters.Most_Popular_CardView;
import com.example.skiathos.Adapters.Most_Viewed_Adapter;
import com.example.skiathos.Adapters.Most_Viewed_CardView;
import com.example.skiathos.Culture.Architecture;
import com.example.skiathos.Culture.Costumes;
import com.example.skiathos.Culture.History;
import com.example.skiathos.Culture.TraditionalSkiathosDance;
import com.example.skiathos.Maps.Bus_Route;
import com.example.skiathos.Maps.Beaches;
import com.example.skiathos.SkiathosNow.Bourtzi;
import com.example.skiathos.SkiathosNow.Kastro;
import com.example.skiathos.SkiathosNow.Papadiamantis_House;
import com.example.skiathos.SkiathosNow.SkiathosTown;
import com.example.skiathos.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final float END_SCALE = 0.35f;  // size of transition between Dashboard and Dropdown Menu

    Button button;
    ImageView history_btn,skiathos_now_btn,beach_btn,kastro_btn, dropdown_menuIcon;
    TextView categories;
    RecyclerView most_popular_beaches_recycler, most_viewed_recycler;
    RecyclerView.Adapter adapter;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    LinearLayout content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        dropdown_menuIcon = findViewById(R.id.dropdown_menu);
        content = findViewById(R.id.content);



        navigationDrawer();
        mostPopularBeachesRecycler();
        mostViewedBeachesRecycler();


        history_btn = findViewById(R.id.history_btn);
        history_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                History();
            }
        });
        skiathos_now_btn = findViewById(R.id.skiathos_now_btn);
        skiathos_now_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkiathosTown();
            }
        });
        beach_btn = findViewById(R.id.beach_btn);
        beach_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Beaches();
            }
        });
        kastro_btn = findViewById(R.id.kastro_btn);
        kastro_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Castle();
            }
        });

        categories = findViewById(R.id.categories_view_all);
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer((GravityCompat.START));
                }
            }
        });
    }


    //   #1  Most Popular Beaches Recycler
    private void mostPopularBeachesRecycler() {

        most_popular_beaches_recycler = findViewById(R.id.most_popular_beaches_recycler);
        most_popular_beaches_recycler.setHasFixedSize(true);
        most_popular_beaches_recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Most_Popular_CardView> card_view_location = new ArrayList<>();


        card_view_location.add(new Most_Popular_CardView(R.drawable.mandraki_elias, "Mandraki Elias", "Mandraki Elias is one of the most quiet and beautiful beaches on the northern side of the island."));
        card_view_location.add(new Most_Popular_CardView(R.drawable.mandraki_xerxis, "Mandraki Xerxis", "Located right next to Mandraki Elias beach,Mandraki Xerxis is for those who seek a peaceful place to sunbath."));
        card_view_location.add(new Most_Popular_CardView(R.drawable.krifi_ammos, "Krifi Ammos", "Krifi Ammos,a small but quite rather beatiful beach is one of the best places to enjoy the islands sunset."));

        adapter = new Most_Popular_Adapter(card_view_location);
        most_popular_beaches_recycler.setAdapter(adapter);

    }

    //   #2  Most Viewed Beaches Recycler
    private void mostViewedBeachesRecycler() {

        ArrayList<Most_Viewed_CardView> most_view_cardView_location = new ArrayList<>();

        most_viewed_recycler = findViewById(R.id.most_viewed_recycler);
        most_viewed_recycler.setHasFixedSize(true);
        most_viewed_recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        most_view_cardView_location.add(new Most_Viewed_CardView(R.drawable.mandraki_elias, "Mandraki Elias", "Mandraki Elias is one of the most quiet and beautiful beaches on the northern side of the island."));
        most_view_cardView_location.add(new Most_Viewed_CardView(R.drawable.mandraki_xerxis, "Mandraki Xerxis", "Located right next to Mandraki Elias beach,Mandraki Xerxis is for those who seek a peaceful place to sunbath."));
        most_view_cardView_location.add(new Most_Viewed_CardView(R.drawable.krifi_ammos, "Krifi Ammos", "Krifi Ammos,a small but quite rather beatiful beach is one of the best places to enjoy the island's sunset."));

        adapter = new Most_Viewed_Adapter(most_view_cardView_location);
        most_viewed_recycler.setAdapter(adapter);
    }


    //Navigation Functions
    private void navigationDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        //navigationView.setCheckedItem(R.id.nav_home);

        dropdown_menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer((GravityCompat.START));
                }
            }
        });
        navigationDrawerAnimation();
    }


    //Navigation Drawer Animation when slided or button pressed
    private void navigationDrawerAnimation() {

        drawerLayout.setScrimColor(getResources().getColor(R.color.cadetblue));

        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

                final float diffScaledOffSet = slideOffset * (1 - END_SCALE);
                final float offsetscale = 1 - diffScaledOffSet;
                content.setScaleX(offsetscale);
                content.setScaleY(offsetscale);

                final float xOffSet = drawerView.getWidth() * slideOffset;
                final float xOffSetDiff = content.getWidth() * diffScaledOffSet / 2;
                final float xTranslation = xOffSet - xOffSetDiff;
                content.setTranslationX(xTranslation);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    // Navigation menu items selection transfer user to another activity
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            //Home
            case R.id.nav_home:
                Home();
                break;

            //Skiathos Now
            case R.id.nav_skiathos_town:
                SkiathosTown();
                break;
            case R.id.nav_bourtzi:
                Bourtzi();
                break;
            case R.id.nav_papadiamantis_house:
                PapadiamantisHouse();
                break;
            case R.id.nav_castle:
                Castle();
                break;


            //Culture
            case R.id.nav_history:
                History();
                break;
            case R.id.nav_architecture:
                Architecture();
                break;
            case R.id.nav_costumes:
                Costumes();
                break;
            case R.id.nav_traditional_skiathos_dance:
                TraditionalSkiathosDance();
                break;


            //Navigation Maps
            case R.id.nav_beaches:
                Beaches();
                break;
            case R.id.nav_bus_route:
                BusRoute();
                break;
        }

        return true;
    }


    // On back button pressed go back a single time
    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    ////// Calling functions

    // Home
    public void Home() {
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }


    //Skiathos Now
    public void SkiathosTown() {
        Intent intent = new Intent(this, SkiathosTown.class);
        startActivity(intent);
    }

    public void Bourtzi() {
        Intent intent = new Intent(this, Bourtzi.class);
        startActivity(intent);
    }

    public void PapadiamantisHouse() {
        Intent intent = new Intent(this, Papadiamantis_House.class);
        startActivity(intent);
    }

    public void Castle() {
        Intent intent = new Intent(this, Kastro.class);
        startActivity(intent);
    }


    //Culture
    public void History() {
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }

    public void Architecture() {
        Intent intent = new Intent(this, Architecture.class);
        startActivity(intent);
    }

    public void Costumes() {
        Intent intent = new Intent(this, Costumes.class);
        startActivity(intent);
    }

    public void TraditionalSkiathosDance() {
        Intent intent = new Intent(this, TraditionalSkiathosDance.class);
        startActivity(intent);
    }


    //Navigation Maps
    public void BusRoute() {
        Intent intent = new Intent(this, Bus_Route.class);
        startActivity(intent);
    }

    public void Beaches() {
        Intent intent = new Intent(this, Beaches.class);
        startActivity(intent);
    }


}
