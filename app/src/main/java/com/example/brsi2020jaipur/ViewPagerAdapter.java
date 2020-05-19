package com.example.brsi2020jaipur;

import android.content.Context;
import android.os.Handler;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.logging.LogRecord;

public class ViewPagerAdapter extends PagerAdapter {

    private int[] Images;
    //={R.mipmap.jantar_mantar,R.mipmap.jal_mahal,R.mipmap.hawa__mahal,R.mipmap.amer_fort};
    private LayoutInflater inflater;
    private Context context;



    public ViewPagerAdapter(Context context, int[] images) {
        this.context= context;
        this.Images=images;

    }




    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.image_list,null);
        ImageView image= (ImageView)v.findViewById(R.id.image_view);
        image.setImageResource(Images[position]);
        ViewPager vp= (ViewPager) container;
        vp.addView(v);
        return v;
    }



    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return Images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }
}
