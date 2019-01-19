package com.example.killer.parcelable;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.parceler.Parcels;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Parcelable parcelable = getIntent().getParcelableExtra("DATE_KEY");
        User user = Parcels.unwrap(parcelable);

        Log.e(TAG, "onCreate: " + user.toString() );
    }
}
