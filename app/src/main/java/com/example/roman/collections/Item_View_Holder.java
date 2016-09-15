package com.example.roman.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Roman on 14.09.2016.
 */

public class Item_View_Holder extends RecyclerView.ViewHolder {

    public ImageView _photo;
    public EditText _fName;
    public EditText _lName;

    public Item_View_Holder(View itemview) {
        super(itemview);
        _photo = (ImageView)itemview.findViewById(R.id.image_view);
        _fName = (EditText) itemview.findViewById(R.id.txt_firstName);
        _lName = (EditText) itemview.findViewById(R.id.txt_lastName);
    }


}
