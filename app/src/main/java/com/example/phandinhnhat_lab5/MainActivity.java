package com.example.phandinhnhat_lab5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvFoodList;
    FoodAdapter foodAdapter;
    ArrayList<Food> foodList;
    ArrayList<Food> foodListSearch;
    EditText editText_Search;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.food_layout);
        lvFoodList = (ListView) findViewById(R.id.listViewFood);
        foodList = new ArrayList<>();

        foodList.add(new Food("1","Donut Red", 20000, R.drawable.donut_red_1));
        foodList.add(new Food("2","Donut Pink", 25000, R.drawable.pink_donut_1));
        foodList.add(new Food("3","Donut Yellow", 25000, R.drawable.donut_yellow_1));
        foodList.add(new Food("4","Donut Green", 25000, R.drawable.green_donut_1));
        foodList.add(new Food("5","Donut Tasty", 25000, R.drawable.tasty_donut_1));


        foodAdapter = new FoodAdapter(this, R.layout.food_layout, foodList);
        lvFoodList.setAdapter(foodAdapter);

        editText_Search = findViewById(R.id.editText_Search);
        btnSearch = findViewById(R.id.btnSearch);
        foodListSearch = new ArrayList<>();

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foodListSearch.clear();
                for(Food food: foodList) {
                    String st = editText_Search.getText().toString();
                    if(food.getName().contains(st)){
                        foodListSearch.add(food);
                    }
                }
                lvFoodList.setAdapter(new FoodAdapter(MainActivity.this, R.layout.food_layout, foodListSearch));
            }
        });



    }
}