package com.example.android.tourguideappudacity;

import android.content.Context;
import android.location.Location;

import java.util.List;

public class outlets {

    public static void initFoodsList(List<location> list, Context context) {

        list.add(new location(
                context.getString(R.string.outlet_gulati_name),
                context.getString(R.string.outlet_gulati_description),
                context.getString(R.string.outlet_gulati_address),
                context.getString(R.string.outlet_gulati_phone),
                context.getString(R.string.outlet_gulati_schedule),
                context.getString(R.string.outlet_gulati_price),
                R.drawable.gulati_image,R.drawable.ic_star_orange_full_24dp,"https://www.zomato.com/ncr/gulati-pandara-road-new-delhi"
        ));

        list.add(new location(
                context.getString(R.string.outlet_indian_name),
                context.getString(R.string.outlet_indian_description),
                context.getString(R.string.outlet_indian_address),
                context.getString(R.string.outlet_indian_phone),
                context.getString(R.string.outlet_indian_schedule),
                context.getString(R.string.outlet_indian_price),
                R.drawable.indian_accent,
                R.drawable.ic_star_orange_full_24dp,"https://www.zomato.com/ncr/indian-accent-lodhi-road-new-delhi"
        ));

        list.add(new location(
                context.getString(R.string.outlet_spice_name),
                context.getString(R.string.outlet_spice_description),
                context.getString(R.string.outlet_spice_address),
                context.getString(R.string.outlet_spice_phone),
                context.getString(R.string.outlet_spice_schedule),
                context.getString(R.string.outlet_spice_price),
                R.drawable.spice_image,R.drawable.ic_star_half_orange_half_24dp,"amanshakya.007@gmail.com"
        ));

        list.add(new location(
                context.getString(R.string.outlet_tamra_name),
                context.getString(R.string.outlet_tamra_description),
                context.getString(R.string.outlet_tamra_address),
                context.getString(R.string.outlet_tamra_phone),
                context.getString(R.string.outlet_tamra_schedule),
                context.getString(R.string.outlet_tamra_price),
                R.drawable.tamra,R.drawable.ic_star_border_orange_null_24dp,"https://www.zomato.com/ncr/tamra-shangri-las-eros-hotel-connaught-place-new-delhi"
        ));

        list.add(new location(
                context.getString(R.string.outlet_moti_name),
                context.getString(R.string.outlet_moti_description),
                context.getString(R.string.outlet_moti_address),
                context.getString(R.string.outlet_moti_phone),
                context.getString(R.string.outlet_moti_schedule),
                context.getString(R.string.outlet_moti_price),
                R.drawable.moti_mahal,R.drawable.ic_star_orange_full_24dp,"https://www.zomato.com/ncr/moti-mahal-daryaganj-delhi"
        ));

        list.add(new location(
                context.getString(R.string.outlet_shang_name),
                context.getString(R.string.outlet_shang_description),
                context.getString(R.string.outlet_shang_address),
                context.getString(R.string.outlet_shang_phone),
                context.getString(R.string.outlet_shang_schedule),
                context.getString(R.string.outlet_shang_price),
                R.drawable.shang_image,R.drawable.ic_star_orange_full_24dp,"https://www.zomato.com/ncr/shang-palace-shangri-las-eros-hotel-new-delhi-connaught-place-new-delhi"
        ));

        list.add(new location(
                context.getString(R.string.outlet_sorrento_name),
                context.getString(R.string.outlet_sorrento_description),
                context.getString(R.string.outlet_sorrento_address),
                context.getString(R.string.outlet_sorrento_phone),
                context.getString(R.string.outlet_sorrento_schedule),
                context.getString(R.string.outlet_sorrento_price),
                R.drawable.sorrento,R.drawable.ic_star_half_orange_half_24dp,"https://www.zomato.com/ncr/sorrento-shangri-las-eros-hotel-new-delhi-connaught-place-new-delhi"
        ));
    }
}
