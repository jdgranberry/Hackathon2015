package com.example.splitix.dcitizen;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Splitix on 11/14/15.
 */
public class CustomListViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<HashMap<String, String>> feed;
    private static LayoutInflater inflater = null;

    public CustomListViewAdapter(Context context, ArrayList<HashMap<String, String>> data){
        mContext = context;
        feed = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return feed.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = inflater.inflate(R.layout.list_row, null);
            TextView title = (TextView) view.findViewById(R.id.feed_title);
            TextView post = (TextView) view.findViewById(R.id.feed_post);
            ImageView icon = (ImageView) view.findViewById(R.id.feed_image);

            Typeface font = Typeface.createFromAsset(mContext.getAssets(), "fonts/HelveticaNeueLTStd_Bd.otf");
            title.setTypeface(font);

            font = Typeface.createFromAsset(mContext.getAssets(), "fonts/HelveticaNeueLTStd_Lt.otf");
            title.setTypeface(font);

            HashMap<String, String> mData;

            mData = feed.get(position);

            title.setText(mData.get("title"));
            post.setText(mData.get("post"));


            // Alternate between light and dark background for list items
            if (position % 2 == 1) {
                // TODO get colors from colors.xml programmatically
                view.setBackgroundColor(Color.parseColor("#ECEECD")); // LIGHT

                if(mData.get("icon") == "pet"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_paw));
                }else if(mData.get("icon") == "food"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_bowl));
                }else if(mData.get("icon") == "blood"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_blooddrive));
                }else if(mData.get("icon") == "natural"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_storm));
                }else if(mData.get("icon") == "comm"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_community));
                }else{
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.senior_citizen));
                }

            } else {
                view.setBackgroundColor(Color.parseColor("#dcc293")); // DARK

                if(mData.get("icon") == "pet"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_paw2));
                }else if(mData.get("icon") == "food"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_bowl2));
                }else if(mData.get("icon") == "blood"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_blooddrive));
                }else if(mData.get("icon") == "natural"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_storm2));
                }else if(mData.get("icon") == "comm"){
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon_community2));
                }else{
                    icon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.senior_citizen));
                }
            }


        }
        return view;
    }
}
