package com.example.rvproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.sad,"date1","subject2"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date3","subject4"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date5","subject6"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date1","subject2"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date3","subject4"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date5","subject6"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date1","subject2"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date3","subject4"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date5","subject6"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date1","subject2"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date3","subject4"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date5","subject6"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date1","subject2"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date3","subject4"));
        exampleList.add(new ExampleItem(R.drawable.sad,"date5","subject6"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}