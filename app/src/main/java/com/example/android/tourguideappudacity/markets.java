package com.example.android.tourguideappudacity;

import android.content.Context;
import android.location.Location;

import java.util.List;

public class markets {

    public static void initShopsList(List<location> list, Context context) {

        list.add(new location(
                context.getString(R.string.market_khan_name),
                context.getString(R.string.market_khan_description),
                context.getString(R.string.market_khan_address),
                null,
                context.getString(R.string.market_khan_schedule),
                null,
                R.drawable.khan,R.drawable.ic_star_border_orange_null_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_janpath_name),
                context.getString(R.string.market_janpath_description),
                context.getString(R.string.market_janpath_address),
                null,
                context.getString(R.string.market_janpath_schedule),
                null,
                R.drawable.janpath,R.drawable.ic_star_border_orange_null_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_karol_name),
                context.getString(R.string.market_karol_description),
                context.getString(R.string.market_karol_address),
                null,
                context.getString(R.string.market_karol_schedule),
                null,
                R.drawable.karol,R.drawable.ic_star_orange_full_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_chandni_name),
                context.getString(R.string.market_chandni_description),
                context.getString(R.string.market_chandni_address),
                null,
                context.getString(R.string.market_chandni_schedule),
                null,
                R.drawable.chandni_image,R.drawable.ic_star_half_orange_half_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_shankar_name),
                context.getString(R.string.market_shankar_description),
                context.getString(R.string.market_shankar_address),
                null,
                context.getString(R.string.market_shankar_schedule),
                null,
                R.drawable.shankar,R.drawable.ic_star_half_orange_half_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_lajpat_name),
                context.getString(R.string.market_lajpat_description),
                context.getString(R.string.market_lajpat_address),
                null,
                context.getString(R.string.market_lajpat_schedule),
                null,
                R.drawable.lagpat_nagar,R.drawable.ic_star_orange_full_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_book_name),
                context.getString(R.string.market_book_description),
                context.getString(R.string.market_book_address),
                null,
                context.getString(R.string.market_book_schedule),
                null,
                R.drawable.book_image,R.drawable.ic_star_border_orange_null_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_chor_name),
                context.getString(R.string.market_chor_description),
                context.getString(R.string.market_chor_address),
                null,
                context.getString(R.string.market_chor_schedule),
                null,
                R.drawable.chor,R.drawable.ic_star_half_orange_half_24dp,null
        ));

        list.add(new location(
                context.getString(R.string.market_gaffar_name),
                context.getString(R.string.market_gaffar_description),
                context.getString(R.string.market_gaffar_address),
                null,
                context.getString(R.string.market_gaffar_schedule),
                null,
                R.drawable.gaffar,R.drawable.ic_star_orange_full_24dp,null
        ));
    }
}
