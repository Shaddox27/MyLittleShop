package com.example.shaddox.mylittleshop;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Shaddox on 2017. 06. 05..
 */

import com.example.shaddox.mylittleshop.data.ItemContract.ItemEntry;

public class DetailActivity {
    /**
     * Allows user to create a new item or edit an existing one.
     */
    public class EditorActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.detail_layout);
        }
    }
}
