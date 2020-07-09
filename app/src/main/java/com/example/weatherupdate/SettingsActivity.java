package com.example.weatherupdate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Settings");
    }
    /*
     * Normally, calling setDisplayHomeAsUpEnabled(true) (we do so in onCreate here) as well as
     * declaring the parent activity in the AndroidManifest is all that is required to get the
     * up button working properly. However, in this case, we want to navigate to the previous
     * screen the user came from when the up button was clicked, rather than a single
     * designated Activity in the Manifest.
     *
     * We use the up button's ID (android.R.id.home) to listen for when the up button is
     * clicked and then call onBackPressed to navigate to the previous Activity when this
     * happens.
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
