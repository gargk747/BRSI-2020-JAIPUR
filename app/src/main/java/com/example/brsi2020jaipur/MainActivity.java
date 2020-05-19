package com.example.brsi2020jaipur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mNavDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer_layout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNavDrawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mNavDrawer, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );

        mNavDrawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        if(savedInstanceState==null)
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new home_fragment())
                    .commit();

            navigationView.setCheckedItem(R.id.nav_home);
    }

    @Override
    public void onBackPressed() {

        if (mNavDrawer.isDrawerOpen(GravityCompat.START))
            mNavDrawer.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new home_fragment()).commit();
                break;
            case R.id.nav_accomodation:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new accomodation_fragment()).commit();
                break;
            case R.id.nav_abstract:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new abstract_fragment()).commit();
                break;
            case R.id.nav_registration:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new registration_fragment()).commit();
                break;
            case R.id.nav_bsaeh_organisers:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new organising_committee()).commit();
                break;
            case R.id.nav_venuw:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new venue_fragment()).commit();
                break;
            case R.id.nav_scientific:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new scientific_fragment()).commit();
                break;
            case R.id.nav_speakers:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new speakers_fragment()).commit();
                break;
            case R.id.nav_contacts:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new contacts_fragment()).commit();
                break;

        }
        mNavDrawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
