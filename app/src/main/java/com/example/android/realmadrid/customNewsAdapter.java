package com.example.android.realmadrid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mostafa on 3/22/18.
 */

public class customNewsAdapter extends ArrayAdapter<news> {
    public customNewsAdapter(Activity context, ArrayList<news> listnews) {
        super(context, 0, listnews);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }
        news getCurrentnews = getItem(position);

        //ImageView imageNews=(ImageView)listItemView.findViewById(R.id.newsImage);
        TextView textView = (TextView) listItemView.findViewById(R.id.titlenews);

        //Picasso.with(listItemView.getContext()).load(getCurrentnews.getUrlToImage()).into(imageNews);
        textView.setText(getCurrentnews.getTitle());

        return listItemView;
    }
}

