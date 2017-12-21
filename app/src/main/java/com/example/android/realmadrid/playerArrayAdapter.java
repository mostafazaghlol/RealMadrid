package com.example.android.realmadrid;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;


/**
 * Created by mostafa on 9/10/17.
 */

public class playerArrayAdapter extends ArrayAdapter<PlayerObject> {
    public playerArrayAdapter(Activity context, ArrayList<PlayerObject> listplayer) {
        super(context, 0,listplayer);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_player, parent, false);
        }
        //get object of the Array
        PlayerObject getCurrentPlayer=  getItem(position);

        //Change the name
        TextView TextName=(TextView)listItemView.findViewById(R.id.playerName);
        TextName.setText(getCurrentPlayer.getmName());
        //change the position
        TextView TextPosition=(TextView)listItemView.findViewById(R.id.playerPosition);
        TextPosition.setText(getCurrentPlayer.getmPosition());
        //Change the Icon
        TextView TextNumber=(TextView) listItemView.findViewById(R.id.numberIcon);
        TextNumber.setText(String.valueOf(getCurrentPlayer.getmNumber()));

        return listItemView;
    }
}
