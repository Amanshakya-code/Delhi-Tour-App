package com.example.android.tourguideappudacity;

import android.content.Context;
import android.location.Location;

import java.util.List;

public class hospital {
    public static void initInfoList(List<location> list, Context context) {

        list.add(new location(
                context.getString(R.string.hospital_aiims_name),
                context.getString(R.string.hospital_aiims_description),
                "https://www.google.com/maps/search/aiims/@28.5665382,77.2083993,17z/data=!3m1!4b1",
                context.getString(R.string.hospital_aiims_phone),
                null,
                null,
                -1,
                -1,
                "https://www.aiims.edu/en.html"
        ));

        list.add(new location(
                context.getString(R.string.hospital_fortis_name),
                context.getString(R.string.hospital_fortis_description),
                "https://www.google.com/maps/place/Fortis+Hospital,+Shalimar+Bagh/@28.7095615,77.167719,17z/data=!3m1!4b1!4m5!3m4!1s0x390d02206e9e71cf:0xb096542618cd68b4!8m2!3d28.7095568!4d77.169913",
                context.getString(R.string.hospital_fortis_phone),
                null,
                null,
                -1,
                -1,
                "https://www.fortishealthcare.com/india/fortis-hospital-in-shalimar-bagh-delhi"
        ));



        list.add(new location(
                context.getString(R.string.hospital_ganga_2),
                context.getString(R.string.hospital_ganga_description),
                "https://www.google.com/maps/place/Sir+Ganga+Ram+Hospital/@28.6385384,77.1875495,17z/data=!3m1!4b1!4m5!3m4!1s0x390d02a17c4ab835:0xecd838535c0fa0f6!8m2!3d28.6385337!4d77.1897435",
                context.getString(R.string.hospital_ganga_pgone),
                null,
                null,
                -1,
                -1,
                "https://sgrh.com/"

        ));
        list.add(new location(
                context.getString(R.string.hospital_max_4),
                context.getString(R.string.hospital_max_discription),
                "https://www.google.com/maps/place/Max+Super+Speciality+Hospital,+Saket+(Max+Saket)/@28.527638,77.1420571,12z/data=!4m8!1m2!2m1!1smax+hospital+in+delh!3m4!1s0x390ce1f427d4c5fb:0x582d47bbf4970bc1!8m2!3d28.527638!4d77.2120949",
                context.getString(R.string.hospital_max_phone),
                null,
                null,
                -1,
                -1,
                "https://www.maxhealthcare.in/hospital-network/max-super-speciality-hospital-saket"

        ));
    }
}
