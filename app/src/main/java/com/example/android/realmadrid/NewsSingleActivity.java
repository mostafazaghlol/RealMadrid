package com.example.android.realmadrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NewsSingleActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_single);
        Intent getdata=getIntent();
        progressBar=(ProgressBar)findViewById(R.id.progress);
        final ArrayList<news> newsList=new ArrayList<>();
        final Intent intent=new Intent(this,News_Details.class);

        Response.Listener<String> listener=new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    progressBar.setVisibility(View.GONE);
                    JSONObject object = new JSONObject(response);
                    JSONArray articles=object.getJSONArray("articles");
                    for (int i=0;i<articles.length();i++){
                        JSONObject articleOb=articles.getJSONObject(i);
                        String author = articleOb.optString("author");
                        String title = articleOb.optString("title");
                        String description = articleOb.optString("description");
                        String url=articleOb.optString("url");
                        String urlToImage=articleOb.optString("urlToImage");
                        String publishedAt=articleOb.optString("publishedAt");
                        newsList.add(new news(author,title,description,url,urlToImage,publishedAt));
                    }
                    for (int i=0;i<newsList.size();i++){
                        Log.e("MainActivity",newsList.get(i).getAuthor());
                        Log.e("MainActivity",newsList.get(i).getDescription());
                        Log.e("MainActivity",newsList.get(i).getTitle());
                        Log.e("MainActivity",newsList.get(i).getUrl());
                        Log.e("MainActivity",newsList.get(i).getUrlToImage());
                    }
                    mRecyclerView = (RecyclerView) findViewById(R.id.recycleview);
                    mRecyclerView.setHasFixedSize(true);
                    mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    mRecyclerView.setLayoutManager(mLayoutManager);
                    mAdapter = new MyRecyclerViewAdapter(newsList, getApplicationContext(), new MyRecyclerViewAdapter.MyClickListener() {
                        @Override
                        public void onItemClick(int position, View v) {
//                            Toast.makeText(NewsSingleActivity.this, "Hi from "+String.valueOf(position), Toast.LENGTH_SHORT).show();
                       intent.putExtra("title",newsList.get(position).getTitle());
                       intent.putExtra("url",newsList.get(position).getUrl());
                       intent.putExtra("urlToimage",newsList.get(position).getUrlToImage());
                       intent.putExtra("description",newsList.get(position).getDescription());
                       startActivity(intent);
                        }
                    });
                    mRecyclerView.setAdapter(mAdapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        getNews couponRequest= new getNews(listener,getdata.getStringExtra("magazine"));
        RequestQueue queue = Volley.newRequestQueue(NewsSingleActivity.this);
        queue.add(couponRequest);




    }


    public class getNews extends StringRequest {
        //private  final static String newsUrl = "https://newsapi.org/v2/top-headlines?sources=talksport&apiKey=ea44902c99564eab94360fcbdf4f282e";
        private Map<String,String> params;

        public getNews(Response.Listener<String> listener,String url) {
            super(Method.GET, url, listener,null);
            params = new HashMap<>();
        }

        @Override
        protected Map<String, String> getParams(){
            return params;
        }
    }
}
