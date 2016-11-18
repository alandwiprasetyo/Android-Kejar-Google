package com.alandwiprasetyo.recyclerview.utils;

/**
 * Created by alandwiprasetyo on 11/19/16.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.alandwiprasetyo.recyclerview.R;

public class DataObjectHolder extends RecyclerView.ViewHolder implements View
        .OnClickListener {
    public TextView label;
    public TextView value;

    public DataObjectHolder(View itemView) {
        super(itemView);
        label = (TextView) itemView.findViewById(R.id.name_course);
        value = (TextView) itemView.findViewById(R.id.textView2);
        Log.i("Test", "Adding Listener");
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}