package com.example.danya.doctors_appointment;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdepter extends RecyclerView.Adapter<MyAdepter.MyViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdepter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.doctor,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        ListItem listItem=listItems.get(i);
        myViewHolder.name.setText(listItem.getName());
        //needs to edit
      //  myViewHolder.pic.setImageDrawable(listItem.getPic());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public ImageView pic;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.doctor_name);
            pic=itemView.findViewById(R.id.circleImageView);
        }
    }
}
