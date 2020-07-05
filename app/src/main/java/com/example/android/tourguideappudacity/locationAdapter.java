package com.example.android.tourguideappudacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class locationAdapter extends ArrayAdapter<location> implements Filterable {
    public locationAdapter(@NonNull Context context, int resource, List<location> list) {
        super(context, resource,list);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final location currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView scheduleLocationTextView = (TextView) listItemView.findViewById(R.id.scheduleTextView);
        scheduleLocationTextView.setText(currentLocation.getSchedule());

        TextView priceLocationTextView = (TextView) listItemView.findViewById(R.id.priceTextView);
        priceLocationTextView.setText(currentLocation.getPrice());

        TextView emaillocationtextview= (TextView) listItemView.findViewById(R.id.email_name);
        emaillocationtextview.setText(currentLocation.getEmail());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getPhone());

        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);
        ImageView imageiconview=(ImageView) listItemView.findViewById(R.id.star_icon);

        if (currentLocation.hasImage()){
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            imageiconview.setImageResource(currentLocation.getImageresourceicon());
            photoLocationImageView.setVisibility(View.VISIBLE);
            imageiconview.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
            imageiconview.setVisibility(View.GONE);
        }

        if (currentLocation.hasPrice()){
            priceLocationTextView.setVisibility(View.VISIBLE);
        } else {
            priceLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasSchedule()){
            scheduleLocationTextView.setVisibility(View.VISIBLE);
        } else {
            scheduleLocationTextView.setVisibility(View.GONE);
        }
        if (currentLocation.hasEmail()){
            emaillocationtextview.setVisibility(View.VISIBLE);
        }else{
            emaillocationtextview.setVisibility(View.GONE);
        }

        if (currentLocation.hasAddress()){
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPhone()){
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
