package com.example.shaddox.mylittleshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Shaddox on 2017. 06. 05..
 */

/**
 * Allows user to create a new item or edit an existing one.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
    }
}
