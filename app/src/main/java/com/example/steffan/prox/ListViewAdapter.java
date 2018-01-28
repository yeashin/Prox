package com.example.steffan.prox;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by yeashin on 2018-01-28.
 */

public class ListViewAdapter extends BaseAdapter{

    private Context cont;
    private LayoutInflater layinf;
    private List<SportsList> sportsLists;
    private ArrayList<SportsList> sportsarray;


    public ListViewAdapter(Context cont, List<SportsList> sports){

        cont = cont;
        sportsLists = sports;
        this.layinf = LayoutInflater.from(cont);
        this.sportsarray = new ArrayList<SportsList>();
        this.sportsarray.addAll(sports);

    }

    @Override
    public int getCount() {
        return sportsLists.size();
    }

    @Override
    public SportsList getItem(int position) {
        return sportsLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder{

        TextView textView;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = layinf.inflate(R.layout.item, null);
            holder.textView = (TextView)convertView.findViewById(R.id.sportname);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.textView.setText(sportsLists.get(position).getName());

        return convertView;
    }

    public void myFilter(String name){
        name = name.toLowerCase(Locale.getDefault());
        sportsLists.clear();
        if (name.length() == 0){
            sportsLists.addAll(sportsarray);
        } else {
            for (SportsList PL : sportsarray){
                if (PL.getName().toLowerCase(Locale.getDefault()).contains(name)){
                    sportsLists.add(PL);
                }
            }
        }
        notifyDataSetChanged();
    }

}
