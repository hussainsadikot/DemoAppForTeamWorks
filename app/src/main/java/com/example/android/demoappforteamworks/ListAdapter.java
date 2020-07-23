package com.example.android.demoappforteamworks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycler,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.id.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView;
        private TextView textViewId,textViewDescription;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.icon);
            textViewId = itemView.findViewById(R.id.tv_id);
            textViewDescription = itemView.findViewById(R.id.tv_desc);


        }
        public void bindView(int position){
            String id = Integer.toString(OurData.id[position]);
            textViewId.setText(id);
            textViewDescription.setText(OurData.desc[position]);
            imageView.setImageResource(OurData.picturePath[position]);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
