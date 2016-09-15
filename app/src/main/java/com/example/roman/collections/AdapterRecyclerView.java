package com.example.roman.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Roman on 14.09.2016.
 */
public class AdapterRecyclerView extends RecyclerView.Adapter<Item_View_Holder> {
    private Context mContext;
    private ArrayList arrayList;
    @Override
    public Item_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Item_View_Holder(view);
    }

    public AdapterRecyclerView(ArrayList arrayList, Context mContext) {
        this.arrayList = arrayList;
        this.mContext = mContext;
    }

    @Override
    public void onBindViewHolder(Item_View_Holder holder, int position) {
        Person person=(Person)arrayList.get(position);

        ImageView imageview=holder._photo;
        Picasso .with(mContext)
                .load(person.get_image_link())
                .into(imageview);


        holder._fName .setText(person.get_fname());
        holder._lName.setText(person.get_lname());
     }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
