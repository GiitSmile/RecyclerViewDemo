package com.muyang.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Model> modelList;
    private RecyclerView recyclerView;
    private ModelAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.mRecyclerView);
        initData();
        mAdapter = new ModelAdapter(MainActivity.this, modelList);
        //使RecyclerView保持固定的大小
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(mAdapter);
    }

    private void initData() {
        modelList = new ArrayList<>();
        modelList.add(new Model(getString(R.string.Jiraiya), getString(R.string.Grandiloquence), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Ninja), getString(R.string.Recall), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Naruto), getString(R.string.Story), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Failure), getString(R.string.Great), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Jiraiya), getString(R.string.Grandiloquence), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Ninja), getString(R.string.Recall), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Naruto), getString(R.string.Story), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Failure), getString(R.string.Great), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Jiraiya), getString(R.string.Grandiloquence), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Ninja), getString(R.string.Recall), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Naruto), getString(R.string.Story), R.mipmap.header));
        modelList.add(new Model(getString(R.string.Failure), getString(R.string.Great), R.mipmap.header));

    }
}
