package com.example.skiathos.Adapters;

public class Most_Popular_CardView {

    int image;
    String title,description;

    public Most_Popular_CardView(int image, String title, String description) {
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

    // Class gia tin dimiourgeia tou adaptora gia na ton kaloume
    // kai na pairnei kai na stelnei ta arxeia opou prepei


}
