package com.singlecell.carousel.ui.indicators;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import com.singlecell.carousel.R; 

public class CircleIndicator extends IndicatorShape {
    int indicatorActiveColor = 0;
    int indicatorInactiveColor = 0;
    public CircleIndicator(Context context, int indicatorSize, boolean mustAnimateChanges, int indicatorActiveColor, int indicatorInactiveColor) {
        super(context, indicatorSize, mustAnimateChanges);
        this.indicatorActiveColor = indicatorActiveColor;
        this.indicatorInactiveColor = indicatorInactiveColor;

        {
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_unselected, null);
            assert drawable != null;
            drawable.setTint(indicatorInactiveColor);
            setBackground(drawable);
        }
    }

    @Override
    public void onCheckedChange(boolean isChecked) {
        super.onCheckedChange(isChecked);
        if (isChecked) {
            {
                Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_selected, null);
                drawable.setTint(indicatorActiveColor);
                setBackground(drawable);
            }
        } else {
            {
                Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_unselected, null);
                drawable.setTint(indicatorInactiveColor);
                setBackground(drawable);
            }
        }
    }
}
