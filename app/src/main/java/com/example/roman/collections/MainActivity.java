package com.example.roman.collections;

import android.graphics.Bitmap;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList myData;
    RecyclerView _rv;
    RecyclerView.LayoutManager layoutManager;
    AdapterRecyclerView adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();


    }

    private void Initialize(){
        _rv = (RecyclerView)findViewById(R.id.rv_activitymain);
        Config cg = new Config();
        _rv.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        _rv.setLayoutManager(layoutManager);
        adapter=new AdapterRecyclerView(cg.getPersonData(), this);
        _rv.setAdapter(adapter);
    }
}
