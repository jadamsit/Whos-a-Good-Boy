package com.jadamsit.whosagoodboy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import java.lang.String;

public class CatPictures extends AppCompatActivity {
    ImageView imageView;
    String url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/800px-Cat03.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_pictures);
        imageView = findViewById(R.id.imageView);
        loadImageFromURL(url);
    }

    private void loadImageFromURL (String url){

    }
}
