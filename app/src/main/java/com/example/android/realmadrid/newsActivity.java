package com.example.android.realmadrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by mostafa on 4/9/18.
 */

public class newsActivity extends AppCompatActivity {
    private final String TalkSports = "https://newsapi.org/v2/top-headlines?sources=talksport&apiKey=ea44902c99564eab94360fcbdf4f282e";
    private final String Marca = "https://newsapi.org/v2/top-headlines?sources=marca&apiKey=ea44902c99564eab94360fcbdf4f282e";
    private final String Fourfourtwo = "https://newsapi.org/v2/top-headlines?sources=four-four-two&apiKey=ea44902c99564eab94360fcbdf4f282e";
    private final String BBC = "https://newsapi.org/v2/top-headlines?sources=bbc-sport&apiKey=ea44902c99564eab94360fcbdf4f282e";
    private final String Fox = "https://newsapi.org/v2/top-headlines?sources=fox-sports&apiKey=ea44902c99564eab94360fcbdf4f282e";
    private final String Espn = "https://newsapi.org/v2/top-headlines?sources=espn&apiKey=ea44902c99564eab94360fcbdf4f282e";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

    }

    public void getNewspage(View view) {
        int id = view.getId();
        Intent i = new Intent(this, NewsSingleActivity.class);
        ;
        switch (id) {
            case R.id.talksports:
                i.putExtra("magazine", TalkSports);
                startActivity(i);
                break;
            case R.id.marca:
                i.putExtra("magazine", Marca);
                startActivity(i);
                break;
            case R.id.fourfourtwo:
                i.putExtra("magazine", Fourfourtwo);
                startActivity(i);
                break;
            case R.id.bbcIcon:
                i.putExtra("magazine", BBC);
                startActivity(i);
                break;
            case R.id.foxnews:
                i.putExtra("magazine", Fox);
                startActivity(i);
                break;
            case R.id.Espn:
                i.putExtra("magazine", Espn);
                startActivity(i);
                break;
        }
    }
}
