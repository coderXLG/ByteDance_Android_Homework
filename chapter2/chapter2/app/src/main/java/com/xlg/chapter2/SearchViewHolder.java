package com.xlg.chapter2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SearchViewHolder extends RecyclerView.ViewHolder {
    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void bind(String text){
        TextView textView =itemView.findViewById(R.id.text);
        textView.setText(text);
    }


}
