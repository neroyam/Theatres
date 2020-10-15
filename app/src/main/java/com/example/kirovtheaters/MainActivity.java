package com.example.kirovtheaters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kirovtheaters.model.Theatre;

public class MainActivity extends AppCompatActivity {

    private String[] theatreNames;
    private String[] theatreAddresses;
    private String[] theatreVk;
    private String[] theatreSites;
    private String[] theatreTroupes;
    private String[] theatrePhones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CardClick(View view) {
        theatreNames = getResources().getStringArray(R.array.theatre_names);
        theatreAddresses = getResources().getStringArray(R.array.theatre_addresses);
        theatreVk = getResources().getStringArray(R.array.theatre_vk);
        theatreSites = getResources().getStringArray(R.array.theatre_sites);
        theatreTroupes = getResources().getStringArray(R.array.theatre_troupes);
        theatrePhones = getResources().getStringArray(R.array.theatre_phones);

        Theatre theatre = new Theatre();

        int curId = view.getId();
        int number = curId == R.id.spassky_theatre ? 0 :
                curId == R.id.drama_theatre ? 1 : 2;

        int imageId = number == 0 ? R.drawable.spassky_theatre :
                number == 1 ? R.drawable.drama_theatre : R.drawable.dolls_theatre;
        theatre.setImageId(imageId);
        theatre.setName(theatreNames[number]);
        theatre.setAddress(theatreAddresses[number]);
        theatre.setSite(theatreSites[number]);
        theatre.setTroupe(theatreTroupes[number]);
        theatre.setVk(theatreVk[number]);
        theatre.setPhone(theatrePhones[number]);

        Intent intent = new Intent(this, TheatreActivity.class);
        intent.putExtra("theatre", theatre);
        startActivity(intent);
    }
}
