package com.wirawansanusi.funfacts.model;

import android.graphics.Color;

/**
 * Created by wirawansanusi on 11/1/15.
 */
public class ColorPallete {

    private String[] mColors;

    public ColorPallete() {

        String[] colors = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7"  // light gray
        };
        mColors = colors;
    }

    public int getColor(int colorNumber) {

        String color_string = mColors[colorNumber];
        int color = Color.parseColor(color_string);

        return color;
    }
}
