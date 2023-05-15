package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView= findViewById(R.id.recyclerview);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Madhu keerthana", "madhu@gmail.com",R.drawable.p6));
        items.add(new Item("Sai", "sai@gmail.com", R.drawable.p2));
        items.add(new Item("Sree", "sree@gmail.com", R.drawable.p7));
        items.add(new Item("Sindhu", "sindhu@gmail.com", R.drawable.p4));
        items.add(new Item("Lahari", "lahari@gmail.com", R.drawable.p8));
        items.add(new Item("keerthana", "keerthana@gmail.com", R.drawable.p7));
        items.add(new Item("Mouniker", "mouniker@gmail.com", R.drawable.p3));
        items.add(new Item("Surya", "surya@gmail.com", R.drawable.p1));
        items.add(new Item("Shiva", "shiva@gmail.com", R.drawable.p4));
        items.add(new Item("Madhu", "madhuu@gmail.com", R.drawable.p6));
        items.add(new Item("Yash", "yash@gmail.com", R.drawable.p2));
        items.add(new Item("Shanmuk", "shanmuk@gmail.com", R.drawable.p6));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
}
}