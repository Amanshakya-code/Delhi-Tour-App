package com.example.android.tourguideappudacity;

import android.content.Context;
import android.location.Location;

import java.util.List;

public class places {
    public static void placeList(List<location> list, Context context) {

        list.add(new location(
                context.getString(R.string.place_rashtrapati_title),
                context.getString(R.string.place_rashtrapati_description),
                context.getString(R.string.place_rashtrapati_address),
                context.getString(R.string.place_rashtrapati_phone),
                context.getString(R.string.place_rashtrapati_schedule),
                context.getString(R.string.place_rashtrapati_price),
                R.drawable.bhawan,R.drawable.ic_star_orange_full_24dp,"https://presidentofindia.nic.in/"
        ));

        list.add(new location(
                context.getString(R.string.place_indiagate_name),
                context.getString(R.string.place_indiagate_description),
                context.getString(R.string.place_indiagate_address),
                context.getString(R.string.place_indiagate_phone),
                context.getString(R.string.place_indiagate_schedule),
                context.getString(R.string.place_indiagate_free),
                R.drawable.india_gate,R.drawable.ic_star_orange_full_24dp,"https://en.wikipedia.org/wiki/India_Gate"
        ));

        list.add(new location(
                context.getString(R.string.place_minar_name),
                context.getString(R.string.place_minar_description),
                context.getString(R.string.place_minar_address),
                context.getString(R.string.place_minar_phone),
                context.getString(R.string.place_minar_schedule),
                context.getString(R.string.place_qutb_minar_price),
                R.drawable.qutob_minar,R.drawable.ic_star_orange_full_24dp,"https://en.wikipedia.org/wiki/Qutb_Minar"
        ));

        list.add(new location(
                context.getString(R.string.place_wonder_name),
                context.getString(R.string.place_wonder_description),
                context.getString(R.string.place_wonder_address),
                context.getString(R.string.place_wonder_phone),
                context.getString(R.string.place_wonder_schedule),
                context.getString(R.string.place_wonder_price),
                R.drawable.wastetowonder,R.drawable.ic_star_orange_full_24dp,"http://hohodelhi.com/waste-to-wonder-park-new-delhi/"
        ));

        list.add(new location(
                context.getString(R.string.place_garden_name),
                context.getString(R.string.place_garden_description),
                context.getString(R.string.place_garden_address),
                context.getString(R.string.place_garden_phone),
                context.getString(R.string.place_garden_schedule),
                context.getString(R.string.place_garder_price),
                R.drawable.garden_five,R.drawable.ic_star_orange_full_24dp,"https://en.wikipedia.org/wiki/Garden_of_Five_Senses"
        ));

        list.add(new location(
                context.getString(R.string.place_mandir_name),
                context.getString(R.string.place_mandir_description),
                context.getString(R.string.place_mandir_address),
                context.getString(R.string.place_chhatrpur),
                context.getString(R.string.place_mandir_schedule),
                context.getString(R.string.place_chhatrpur),
                R.drawable.chhatarpur_mandir,R.drawable.ic_star_orange_full_24dp,"https://en.wikipedia.org/wiki/Chhatarpur_Temple"
        ));

        list.add(new location(
                context.getString(R.string.place_sri_name),
                context.getString(R.string.place_sri_description),
                context.getString(R.string.place_sri_address),
                context.getString(R.string.place_sri_phone),
                context.getString(R.string.place_sri_schedule),
                context.getString(R.string.place_balashib_price),
                R.drawable.bangla_sahib,R.drawable.ic_star_orange_full_24dp,"https://en.wikipedia.org/wiki/Gurudwara_Bangla_Sahib"
        ));
    }
}
