package com.example.listviewdialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    List<String> list = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        list.add("这是一条数据");
        list.add("这是一条数据");
        list.add("这是一条数据");
        list.add("这是一条数据");
        list.add("这是一条数据");

        MyAdapter adapter = new MyAdapter(this,list);
        listview.setAdapter(adapter);

    }
}
