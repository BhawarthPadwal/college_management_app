package com.example.trialtwo;

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

public class dashboard extends AppCompatActivity {

    private DrawerLayout drawer_layout;
    private NavigationView navigationView;
    Toolbar toolbar;


/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drawer_menu, menu);
        return true;
    }
*/

/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.academics_menu:e:
            Toast.makeText(this, "academics", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.library_menu:
                Toast.makeText(this, "library", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
//        setNavigationViewListener();

        toolbar = findViewById(R.id.toolbar);
        drawer_layout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        setSupportActionBar(toolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer_layout,toolbar,R.string.navigation_open,R.string.navigation_close);

        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.home_menu:
                        Toast.makeText(dashboard.this, "Home", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.academics_menu:
                        Toast.makeText(dashboard.this, "Academics", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.library_menu:
                        Toast.makeText(dashboard.this, "Library", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.data_menu:
                        Toast.makeText(dashboard.this, "Data", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_logout:
                        Toast.makeText(dashboard.this, "logout", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_message:
                        Toast.makeText(dashboard.this, "message", Toast.LENGTH_SHORT).show();
                        return true;
                }


                return true;
            }
        });

    }



/*
    private void setNavigationViewListener() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
*/

/*
    public void onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
*/


}

