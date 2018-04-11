package com.example.android.realmadrid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class News_Details extends AppCompatActivity {
    @BindView(R.id.imageOfDetailNews)
    ImageView ImageViewDetail;

    @BindView(R.id.titleDetailnews)
    TextView TextViewTitle;

    @BindView(R.id.Details)
    TextView TextViewDetails;

    @BindView(R.id.openwebsite)
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__details);
        ButterKnife.bind(this);
        Intent getIntent = getIntent();
        String urlToImage=getIntent.getStringExtra("urlToimage");
        String url=getIntent.getStringExtra("url");
        String Title=getIntent.getStringExtra("title");
        String description=getIntent.getStringExtra("description");
        final Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        Picasso.with(getApplicationContext()).load(urlToImage).into(ImageViewDetail);
        TextViewTitle.setText(Title);
        TextViewDetails.setText(description);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

    }
}
