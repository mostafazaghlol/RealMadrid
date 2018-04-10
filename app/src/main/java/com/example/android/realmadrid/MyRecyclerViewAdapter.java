package com.example.android.realmadrid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by mostafa on 4/9/18.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.DataObjectHolder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<news> mDataset;
    private static MyClickListener myClickListener;
    private Context context;

    public static class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView title;

        public DataObjectHolder(View itemView) {
            super(itemView);
            try {
                imageView = (ImageView) itemView.findViewById(R.id.imageOfNews);
                title = (TextView) itemView.findViewById(R.id.title);
                Log.i(LOG_TAG, "Adding Listener");
                itemView.setOnClickListener(this);
            }catch (Exception e){
                Log.e(LOG_TAG,e.getMessage()+"  DataObjectHolder   ");
            }
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }

    public MyRecyclerViewAdapter(ArrayList<news> myDataset, Context mContext) {
        mDataset = myDataset;
        context = mContext;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        DataObjectHolder dataObjectHolder=null;
        try {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
            dataObjectHolder = new DataObjectHolder(view);
            return dataObjectHolder;
        }catch (Exception e){
            Log.e(LOG_TAG,e.getMessage()+"    onCreateViewHolder   ");
        }

        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        try {
            holder.title.setText(mDataset.get(position).getTitle());
            Picasso.with(context).load(mDataset.get(position).getUrlToImage()).into(holder.imageView);
        }catch (Exception e){
            Log.e(LOG_TAG,e.getMessage()+"   onBindViewHolder   ");
        }
    }

    public void addItem(news dataObj, int index) {
        mDataset.add(index, dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }
}
