package com.example.skiathos.Adapters;

public class Most_Viewed_CardView {

    int image;
    String title,description;

    public Most_Viewed_CardView(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
