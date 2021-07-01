package com.example.thii;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter  extends BaseAdapter {
    private Context context;
    private int layout;
    List<hoaqua> hoaquaList;

    public Adapter(Context context, int layout, List<hoaqua> hoaquaList) {
        this.context = context;
        this.layout = layout;
        this.hoaquaList = hoaquaList;
    }

    @Override
    public int getCount() {
        return hoaquaList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        ImageView img = (ImageView)convertView.findViewById(R.id.imageView);
        TextView txt1 = (TextView)convertView.findViewById(R.id.textView);
        TextView txt2 = (TextView)convertView.findViewById(R.id.textView2);

        hoaqua hoaqua = hoaquaList.get(position);
        img.setImageResource(hoaqua.getImg());
        txt1.setText(hoaqua.getTieude());
        txt2.setText(hoaqua.getMota());
        return convertView;
    }
}
