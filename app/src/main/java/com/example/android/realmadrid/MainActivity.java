package com.example.android.realmadrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //open About Team  page
        TextView mQuizPage=(TextView)findViewById(R.id.AboutTeam);
        mQuizPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,AboutTeam.class);
                startActivity(i1);
            }
        });


        //Open manager page.
        TextView mManagerPage=(TextView)findViewById(R.id.managerTextview);
        mManagerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,manager.class);
                startActivity(i1);

            }
        });

        //open Player page
        TextView mPlayerPage=(TextView)findViewById(R.id.playerTextview);
        mPlayerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,player.class);
                startActivity(i1);
            }
        });



        //open next match page
        TextView mNextMatch=(TextView)findViewById(R.id.nextMatchTextview);
        mNextMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,nextMatch.class);
                startActivity(i1);
            }
        });




    }
}
