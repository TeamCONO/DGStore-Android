package org.devele.study;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>implements OnSentenceItemClickListener{
    ArrayList<Sentence> items = new ArrayList<Sentence>();
    OnSentenceItemClickListener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int viewType){
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item_list,viewGroup,false);

        return new ViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position){
        Sentence item = items.get(position);
        viewHolder.setItem(item);
    }
    @Override
    public int getItemCount(){
        return items.size();
    }

    public void addItem(Sentence item){
        items.add(item);
    }

    public void setItems(ArrayList<Sentence> items){
        this.items = items;
    }

    public Sentence getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, Sentence item){
        items.set(position, item);
    }

    public void setOnItemClickListener(OnSentenceItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onItemClick(ViewHolder holder, View view,int position){
        if(listener!=null){
            listener.onItemClick(holder,view,position);
        }
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView teamname;
        public ViewHolder(View itemView,final OnSentenceItemClickListener listener) {
            super(itemView);
            title = itemView.findViewById(R.id.project_title);
            teamname = itemView.findViewById(R.id.teamname);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener!=null){
                        listener.onItemClick(ViewHolder.this,view,position);
                    }
                }
            });
        }
        public void setItem (Sentence item){
                title.setText(item.getTitle());
                teamname.setText(item.getTeamname());
        }
    }
}
