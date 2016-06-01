package com.mozilla.hackathon.kiboko.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mozilla.hackathon.kiboko.R;


public class IconsFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "page_number";

    public IconsFragment() {
    }

    public static IconsFragment newInstance() {
        IconsFragment fragment = new IconsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, 2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_icons_layout, container, false);

        TextView txt = (TextView) rootView.findViewById(R.id.page_number_label);
        int page = getArguments().getInt(ARG_PAGE_NUMBER, -1);
        txt.setText(String.format("Page %d", page));

        return rootView;
    }
}
