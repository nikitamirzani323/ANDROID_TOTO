package com.toto.sdsb.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.toto.sdsb.R;
import com.toto.sdsb.TipeGame;
import com.toto.sdsb.model.PasaranList;

import java.util.List;

public class PasaranListAdapter extends RecyclerView.Adapter<PasaranListAdapter.MyViewHolder> {
    Context context;
    List<PasaranList> pasaranLists;

    public PasaranListAdapter(Context context, List<PasaranList> pasaranLists){
        this.context = context;
        this.pasaranLists = pasaranLists;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.listpasaran_layout,parent,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull PasaranListAdapter.MyViewHolder holder, int position) {
        holder.item_name.setText(pasaranLists.get(position).getNmPasaran());
        holder.item_periode.setText(pasaranLists.get(position).getPeriodePasaran());
        holder.item_date.setText(pasaranLists.get(position).getDatePasaran());
        holder.item_status.setText(pasaranLists.get(position).getStatusPasaran());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, TipeGame.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pasaranLists.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView item_name, item_periode, item_date, item_status;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_name = itemView.findViewById(R.id.txtPasaran_name);
            item_periode = itemView.findViewById(R.id.txtPasaran_periode);
            item_date   = itemView.findViewById(R.id.txtPasaran_date);
            item_status = itemView.findViewById(R.id.txtPasaran_status);
        }
    }
}
