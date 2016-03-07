package com.example.camillesaavedra.bluelippie.Model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.camillesaavedra.bluelippie.R;
import com.example.camillesaavedra.bluelippie.Classes.Review;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    TextView tv_appName;
    ImageButton btn_feed, btn_camera, btn_userProfile;

    ArrayList<Review> reviewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_feed);

        tv_appName = (TextView) findViewById(R.id.tv_appName);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/master_of_break.ttf");
        tv_appName.setTypeface(myCustomFont);

        //constants (MIGHT TRANSFER TO ANOTHER CLASS) (USED BY SEVERAL CLASSES)
        btn_feed = (ImageButton) findViewById(R.id.btn_feed);
        btn_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goes to feed
            }
        });

        btn_camera = (ImageButton) findViewById(R.id.btn_camera);
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //access camera
                //access gallery
            }
        });

        btn_userProfile = (ImageButton) findViewById(R.id.btn_userProfile);
        btn_userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goes to user profile
            }
        });
        //end of constants

        reviewList = new ArrayList<>();

        //add data
        //create adapter class
    }

}
