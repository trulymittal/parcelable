package com.example.killer.parcelable;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoSecondActivity(View view) {

        User user = new User("John Doe", 26);
        Parcelable parcelable = Parcels.wrap(user);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("DATE_KEY", parcelable);
        startActivity(intent);


    }
}
