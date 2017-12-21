package com.example.android.realmadrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class playerdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerdate);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        int message = intent.getIntExtra("positon",0);
        String Name=intent.getStringExtra("name");
        String Age=intent.getStringExtra("age");
        String PlaceOfBirth=intent.getStringExtra("placeOfBirth");
        double Weight=intent.getDoubleExtra("weight",0);
        double Height=intent.getDoubleExtra("height",0.0);
        //Toast.makeText(playerdate.this,String.valueOf(message), Toast.LENGTH_LONG).show();
        //set the image
        ImageView playerImage=(ImageView)findViewById(R.id.imageView);
        playerImage.setImageResource(message);
        //set the textName
        TextView Tname=(TextView)findViewById(R.id.nameProperty);
        Tname.setText("Name : "+Name);
        //set the textplaceOfBirth
        TextView TplaceOfBirth=(TextView)findViewById(R.id.placeOfBirthProperty);
        TplaceOfBirth.setText("Place of birth : "+PlaceOfBirth);
        //set the textAge
        TextView Tage=(TextView)findViewById(R.id.yearOfBirthProperty);
        Tage.setText("Year of birth : " +Age);
        //set the textWeight
        TextView Tweight=(TextView)findViewById(R.id.weightProperty);
        Tweight.setText("Weight : " +String.valueOf(Weight)+" Kg.");
        //set the textHeight
        TextView Theight=(TextView)findViewById(R.id.heightProperty);
        Theight.setText("Height : "+String.valueOf(Height)+" m.");

    }
}
