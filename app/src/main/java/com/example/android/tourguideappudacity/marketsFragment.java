package com.example.android.tourguideappudacity;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class marketsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<location> list = new ArrayList<>();
        markets.initShopsList(list, getContext());
        locationAdapter adapter = new locationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.list_location, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return view;
    }
}
