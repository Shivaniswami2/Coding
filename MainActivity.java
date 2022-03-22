package com.firstapp.imagerslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);


        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://media-exp1.licdn.com/dms/image/C561BAQH65fZfm_SyWg/company-background_10000/0/1594625804077?e=2147483647&v=beta&t=-1mxRi7gTusVj6uL3BS9KHrfRYsgiGk5DdJnovZ3rGU","1 Image"));
        slideModels.add(new SlideModel("https://careerworldedu.org/storage/files/in/2200/thumb-816x460-28ae5272f8f469db11d6794ca541ba15.jpg","2 Image"));
        slideModels.add(new SlideModel("https://images.static-collegedunia.com/public/college_data/images/campusimage/15857152962.JPG","3 Image"));
        slideModels.add(new SlideModel("https://careerworldedu.org/storage/files/in/2200/thumb-816x460-9a7f3d554319cd1304efbb48da6b9c06.jpg","4 Image"));
        imageSlider.setImageList(slideModels, true );
    }
}