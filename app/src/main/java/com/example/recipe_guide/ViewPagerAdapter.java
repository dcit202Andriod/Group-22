package com.example.recipe_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    int images[] = {
            R.drawable.one,
            R.drawable.one1,
    };
    int heading[] ={
            R.string.heading_1,
            R.string.heading_2,
            R.string.heading_3,

    };

    int desription[]={
            R.string.des_1,
            R.string.des_2,
            R.string.des_3,
    };

    public ViewPagerAdapter(Context context){
        this.context = context;
    }



    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.sliderlayout,container,false);

        ImageView slidetitleimage = (ImageView) view.findViewById(R.id.titleimage);
        TextView slideHeading = (TextView)  view.findViewById(R.id.texttitle);
        TextView slideDescription = (TextView) view.findViewById(R.id.textdes);

        slidetitleimage.setImageResource(images[position]);
        slideHeading.setText(heading[position]);
        slideDescription.setText(desription[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

    }
}
