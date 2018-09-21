package com.jadamsit.whosagoodboy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    /** Called when the user taps the Send button */
    public void seeCats(View view) {
        Intent intent = new Intent(this, CatPictures.class);
        startActivity(intent);
    }

    public void seeDogs(View view) {
        Intent intent = new Intent(this, DogPictures.class);
        startActivity(intent);
    }
}
