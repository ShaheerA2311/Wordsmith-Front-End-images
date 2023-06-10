package com.example.divyansh.googleapivoice;

import android.widget.ImageView;

public class PredictionModel {
    // string predicted_word for storing predicted_word
    // and imgid for storing image id.
    private String predicted_word;
    private ImageView predicted_image;

    public PredictionModel(String predicted_word, ImageView imgid) {
        this.predicted_word = predicted_word;
        this.predicted_image = predicted_image;
    }

    public String get_word() {
        return predicted_word;
    }

    public void set_word(String predicted_word) {
        this.predicted_word = predicted_word;
    }

    public ImageView getImgid() {
        return predicted_image;
    }

    public void setImgid(int imgid) {
        this.predicted_image = predicted_image;
    }
}
