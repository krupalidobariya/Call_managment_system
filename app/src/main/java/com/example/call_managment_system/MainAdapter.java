package com.example.call_managment_system;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] numberword;
    private int[] number;

    public MainAdapter(Context c,String[] numberword,int[] number)
    {
        context=c;
        this.numberword=numberword;
        this.number=number;
    }
    @Override
    public int getCount() {
        return numberword.length;
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
        if(inflater==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView =inflater.inflate(R.layout.list_item,null);

        }
        //ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView textView = convertView.findViewById(R.id.text_view);
        textView.setText(numberword[position]);
        textView.setText(number[position]);
        return convertView;


    }
}
