package com.example.resider2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.res);

        Name adapter = new Name(contacts);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        contacts = new ArrayList<>();
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");
        contacts.add("Emil");

    }
}