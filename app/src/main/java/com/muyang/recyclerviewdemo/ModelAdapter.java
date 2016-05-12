package com.muyang.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by muyang on 2016/5/12.
 * 适配器类
 */
public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.MyViewHolder> {
    private List<Model> modelList;
    private Context mContext;

    public ModelAdapter(Context context, List<Model> modelList) {
        this.mContext = context;
        this.modelList = modelList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, desc;
        public ImageView photo;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            desc = (TextView) itemView.findViewById(R.id.desc);
            photo = (ImageView) itemView.findViewById(R.id.photo);
        }
    }

    @Override
    public ModelAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ModelAdapter.MyViewHolder holder, int position) {
        Model model=modelList.get(position);
        holder.title.setText(model.getTitle());
        holder.desc.setText(model.getDesc());
        holder.photo.setBackgroundResource(model.getImgId());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
