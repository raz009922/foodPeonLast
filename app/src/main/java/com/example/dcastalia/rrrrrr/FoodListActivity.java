package com.example.dcastalia.rrrrrr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class FoodListActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        toolbar=findViewById(R.id.toolbarxx20);
           setSupportActionBar(toolbar);
    }
}
