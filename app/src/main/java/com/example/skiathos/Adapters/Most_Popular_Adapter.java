package com.example.skiathos.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skiathos.R;

import java.util.ArrayList;

public class Most_Popular_Adapter extends RecyclerView.Adapter<Most_Popular_Adapter.CardViewHolder> {

    ArrayList<Most_Popular_CardView> most_popular_card_view_location;

    public Most_Popular_Adapter(ArrayList<Most_Popular_CardView> most_popular_card_view_location) {
        this.most_popular_card_view_location = most_popular_card_view_location;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mostpb_card_design, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);

        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        Most_Popular_CardView mostPopularCard_view_ = most_popular_card_view_location.get(position);
        holder.image.setImageResource(mostPopularCard_view_.getImage());
        holder.title.setText(mostPopularCard_view_.getTitle());
        holder.description.setText(mostPopularCard_view_.getDescription());
    }


    @Override
    public int getItemCount() {
        return most_popular_card_view_location.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, description;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.card_image);
            title = itemView.findViewById(R.id.card_title);
            description = itemView.findViewById(R.id.card_description);
        }
    }
    //Idios kodikas 3 fores gia ta diaforetika designs
    //allazo tis onomasies opou xreiastei vasi ton kainourgion adapters
}
