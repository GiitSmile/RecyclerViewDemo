package com.muyang.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
        private Button share;
        private Button readmore;
        private CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            desc = (TextView) itemView.findViewById(R.id.desc);
            photo = (ImageView) itemView.findViewById(R.id.photo);
            share = (Button) itemView.findViewById(R.id.btn_share);
            readmore = (Button) itemView.findViewById(R.id.btn_more);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }

    @Override
    public ModelAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ModelAdapter.MyViewHolder holder, final int position) {
        Model model = modelList.get(position);
        holder.title.setText(model.getTitle());
        holder.desc.setText(model.getDesc());
        holder.photo.setBackgroundResource(model.getImgId());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DescActivity.class);
                intent.putExtra("Desc", modelList.get(position));
                mContext.startActivity(intent);
            }
        });
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
                intent.putExtra(Intent.EXTRA_TEXT, modelList.get(position).getDesc());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(Intent.createChooser(intent, modelList.get(position).getTitle()));
            }
        });
        holder.readmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DescActivity.class);
                intent.putExtra("Desc", modelList.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
