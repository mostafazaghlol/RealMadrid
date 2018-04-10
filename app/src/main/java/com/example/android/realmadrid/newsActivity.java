package com.example.android.realmadrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by mostafa on 4/9/18.
 */

public class newsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

    }

    public void getNewspage(View view) {
        int id=view.getId();
        Intent i;
        switch (id){
            case R.id.talksports:
                i=new Intent(this,NewsSingleActivity.class);
                startActivity(i);
                break;
        }
    }
}
