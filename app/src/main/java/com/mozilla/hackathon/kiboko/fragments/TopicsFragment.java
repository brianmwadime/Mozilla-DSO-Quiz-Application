package com.mozilla.hackathon.kiboko.fragments;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.mozilla.hackathon.kiboko.R;
import com.mozilla.hackathon.kiboko.adapters.TopicsAdapter;
import com.mozilla.hackathon.kiboko.models.Topic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class TopicsFragment extends Fragment {
    // List view
    private ListView lv;

    // Listview Adapter
    TopicsAdapter adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> topicsList;

    public TopicsFragment() {
    }

    public static TopicsFragment newInstance() {
        TopicsFragment fragment = new TopicsFragment();
        Bundle args = new Bundle();
//        args.putInt(ARG_PAGE_NUMBER, 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_topics_layout, container, false);

        lv = (ListView) rootView.findViewById(R.id.topics_list);

        inputSearch = (EditText) rootView.findViewById(R.id.inputSearch);


        return rootView;
    }

    private List<Topic> getTopics() {
        List<Topic> list = new ArrayList<Topic>();
        list.add(get("Wifi", "Wifi"));
        list.add(get("Using your alarm", "Wifi"));
        list.add(get("Calendar Setup", "Wifi"));
        list.add(get("Navigation", "Wifi"));

        return list;
    }

    private Topic get(String s, String i) {
        return new Topic(s, i);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adapter = new TopicsAdapter(this.getActivity(), getTopics());
        lv.setAdapter(adapter);

        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
//                TopicsFragment.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

}
