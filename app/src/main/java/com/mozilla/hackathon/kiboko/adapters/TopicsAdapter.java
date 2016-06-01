package com.mozilla.hackathon.kiboko.adapters;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mozilla.hackathon.kiboko.R;
import com.mozilla.hackathon.kiboko.models.Topic;

import java.util.List;

/**
 * Created by Brian Mwadime on 01/06/2016.
 */
public class TopicsAdapter  extends BaseAdapter {
    List<Topic> topics;
    Context context;
    private static LayoutInflater inflater=null;
    public TopicsAdapter(Activity activity, List<Topic> topics) {
        // TODO Auto-generated constructor stub
        this.topics = topics;
        this.context = activity;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return topics.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return topics.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.topic_item, null);
        holder.tv=(TextView) rowView.findViewById(R.id.topic_name);
        holder.img=(ImageView) rowView.findViewById(R.id.topic_icon);
        holder.tv.setText(topics.get(position).getName());
        holder.img.setImageURI(Uri.parse(topics.get(position).getImage()));
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}