package com.example.steffan.prox;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yeashin on 2018-01-27.
 */

public class Listadapter extends RecyclerView.Adapter<Listadapter.ViewHolder> {


    List<ListItem> listItems;
    private Context context;

    public Listadapter(List<ListItem> listItems,Context context){
        this.listItems = listItems;
        this.context = context;

    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.feed_list,parent,false);
        return new ViewHolder(v);


    }

    public void onBindViewHolder(ViewHolder holder, int position){

        ListItem listItem = listItems.get(position);
        holder.textview_header.setText(listItem.getHeader());
        holder.textView_description.setText(listItem.getDescription());


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textview_header;
        private TextView textView_description;

        public ViewHolder(View itemView){
            super(itemView);
            textview_header =(TextView) itemView.findViewById(R.id.textview_header);
            textView_description = (TextView) itemView.findViewById(R.id.textview_description);

        }


    }



}
