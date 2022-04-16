package com.example.resider2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHold extends RecyclerView.ViewHolder {
    private TextView contacts;

    public NameViewHold(@NonNull View itemView) {
        super(itemView);

        contacts = itemView.findViewById(R.id.res);
    }

    public void bind(String nameValue) {
        contacts.setText(nameValue);
    }
}
