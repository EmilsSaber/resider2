package com.example.resider2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Name extends RecyclerView.Adapter<NameViewHold> {
    private ArrayList<String> contacts = new ArrayList<>();

    public Name(ArrayList<String> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public NameViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHold(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHold holder, int position) {
        holder.bind(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

}
