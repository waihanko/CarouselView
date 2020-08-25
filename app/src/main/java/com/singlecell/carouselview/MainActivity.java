package com.singlecell.carouselview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.singlecell.carousel.model.Slide;
import com.singlecell.carousel.ui.Slider;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addSlider();
    }

    private void addSlider() {
        final Slider slider = findViewById(R.id.carouselSlider);
        List<Slide> slideList = new ArrayList<>();
        slideList.add(new Slide("https://www.tripsavvy.com/thmb/0aVLgbnFXcapl77ym5R__n7pLZU=/2119x1415/filters:fill(auto,1)/GettyImages-646927586-5af207593037130036dbf349.jpg", getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide("https://www.peregrineadventures.com/sites/peregrine/files/styles/low-quality/public/bagan_01.jpg", getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide("https://static.independent.co.uk/s3fs-public/thumbnails/image/2019/07/02/15/bagan-myanmar.jpg?w968h681", getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide("https://media.tacdn.com/media/attractions-splice-spp-674x446/09/a2/38/f2.jpg", getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));

        slider.setItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), i + "", Toast.LENGTH_SHORT).show();
            }
        });

//add slides to slider
        slider.addSlides(slideList);
    }
}