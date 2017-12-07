package com.example.rzl.listviewexample2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rzl on 12/7/2017.
 */

public class BuahArrayAdapter extends ArrayAdapter<Buah> {
    private Context context;
    private List<Buah> buahList;

    public BuahArrayAdapter(Context context, int resource, List<Buah> buahList) {
        super(context, resource, buahList);
        this.context = context;
        this.buahList = buahList;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);

        Buah buah = buahList.get(position);

        TextView headerTextView = (TextView)rowView.findViewById(R.id.header);
        headerTextView.setText(buah.getNama());

        TextView vitaminTextView = (TextView)rowView.findViewById(R.id.Vitamin);
        vitaminTextView.setText(buah.getVitamin());

        TextView deskripsiTextView = (TextView) rowView.findViewById(R.id.Deskripsi);
        deskripsiTextView.setText(buah.getDeskripsi());

        return rowView;
    }
}
