package com.mozilla.hackathon.kiboko.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mozilla.hackathon.kiboko.R;

/**
 * Created by michael on 4/29/16.
 */
public class ListAdapter extends ArrayAdapter{

private final Context context;
private final String[] values;

        public ListAdapter(Context context, String[] values) {
            super(context, -1, values);
            this.context = context;
            this.values = values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.row_item, parent, false);
            TextView textView = (TextView) rowView.findViewById(R.id.action_title);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
            textView.setText(values[position]);

            TextView descView= (TextView)rowView.findViewById(R.id.action_desc);
            descView.setText("Get settings for your phone to access the internet");
            String s = values[position];

            return rowView;
        }
}

