package com.example.lasso.nitebite.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lasso.nitebite.Interface.ItemClickListener;
import com.example.lasso.nitebite.R;



public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ItemClickListener itemClickListener;

    public TextView txtMenuName;
    public ImageView imageView;

    public MenuViewHolder(View itemView){
        super(itemView);
        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView = (ImageView)itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;

    }

    public void onClick(View view){
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
