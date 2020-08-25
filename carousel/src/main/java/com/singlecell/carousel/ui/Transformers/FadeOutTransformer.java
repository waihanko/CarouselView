package com.singlecell.carousel.ui.Transformers;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

public class FadeOutTransformer implements ViewPager.PageTransformer{

    public void transformPage(View page, float position) {
        page.setTranslationX(-position*page.getWidth());

        page.setAlpha(1-Math.abs(position));
    }

}
