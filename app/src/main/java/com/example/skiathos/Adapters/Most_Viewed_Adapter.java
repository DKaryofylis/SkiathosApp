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

public class Most_Viewed_Adapter extends RecyclerView.Adapter<Most_Viewed_Adapter.Most_Viewed_CardViewHolder> {

    ArrayList<Most_Viewed_CardView> most_viewed_cardView_location;

    public Most_Viewed_Adapter(ArrayList<Most_Viewed_CardView> most_viewed_cardView_location) {
        this.most_viewed_cardView_location = most_viewed_cardView_location;
    }

    @NonNull
    @Override
    public Most_Viewed_CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mostviewed_card_design, parent, false);
        Most_Viewed_CardViewHolder most_viewed_cardViewHolder = new Most_Viewed_CardViewHolder(view);

        return most_viewed_cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Most_Viewed_CardViewHolder holder, int position) {
        Most_Viewed_CardView mostViewedCard_view_ = most_viewed_cardView_location.get(position);
        holder.image.setImageResource(mostViewedCard_view_.getImage());
        holder.title.setText(mostViewedCard_view_.getTitle());
        holder.description.setText(mostViewedCard_view_.getDescription());
    }


    @Override
    public int getItemCount() {
        return most_viewed_cardView_location.size();
    }

    public static class Most_Viewed_CardViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title, description;

        public Most_Viewed_CardViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.koukoukaries_image);
            title = itemView.findViewById(R.id.koukounaries_title);
            description = itemView.findViewById(R.id.koukounaries_description);
        }
    }
}
