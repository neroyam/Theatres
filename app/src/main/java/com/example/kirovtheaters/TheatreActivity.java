package com.example.kirovtheaters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kirovtheaters.model.Theatre;

public class TheatreActivity extends AppCompatActivity {

    private Theatre theatre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatre);
        Bundle intent = getIntent().getExtras();
        theatre = (Theatre)(intent != null ? intent.getSerializable("theatre") : null);

        ((ImageView)findViewById(R.id.theatre_image_view_details))
                .setImageResource(theatre.getImageId());
        ((TextView)findViewById(R.id.theatre_name_text_view_details))
                .setText(theatre.getName());
        ((TextView)findViewById(R.id.theatre_address_text_view))
                .setText(theatre.getAddress());
        ((TextView)findViewById(R.id.theatre_site_text_view))
                .setText(theatre.getSite());
        ((TextView)findViewById(R.id.theatre_vk_text_view))
                .setText(theatre.getVk());
        ((TextView)findViewById(R.id.theatre_phone_text_view))
                .setText(theatre.getPhone());
    }

    public void TroupeButtonClick(View view) {
        Intent intent = new Intent(this, ActorsActivity.class);
        intent.putExtra("theatre", theatre);
        startActivity(intent);
    }
}
