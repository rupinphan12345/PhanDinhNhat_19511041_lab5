package com.example.phandinhnhat_lab5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {
    private ImageView imgPicture2;
    private TextView txtName2, txtPrice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        imgPicture2 = findViewById(R.id.imgPicture2);
        txtName2 = findViewById(R.id.txtName2);
        txtPrice2 = findViewById(R.id.txtPrice2);

//        Intent intent = getIntent();
//        Food food = (Food) getIntent().getSerializableExtra("foodKey");

        String name = getIntent().getStringExtra("name");
        Double price = (Double) getIntent().getDoubleExtra("price", 0);
        int image = getIntent().getIntExtra("img", 0);

        imgPicture2.setImageResource(image);
        txtName2.setText(name);
        txtPrice2.setText(String.valueOf(price));
    }
}
