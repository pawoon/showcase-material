package com.pawoon.faizf.showcaselibrary;

import android.app.Activity;
import android.view.View;

import com.showcase.faizfiaz.MaterialShowcaseView;
import com.showcase.faizfiaz.shape.RectangleShape;


/**
 * Created by faizf on 28/05/2018.
 */

public class ShowCaseUtil {
    public static MaterialShowcaseView showCase(View target, Activity activity, int layout, int width, int height,
                                                boolean drawSpotLight, boolean topBottom) {
        return new MaterialShowcaseView.Builder(activity)
                .setTarget(target)
                .setLayout(layout)
                .setShape(new RectangleShape(width, height, drawSpotLight))
                .setShapePadding(0)
                .setTopBottom(topBottom)
                .setMaskColour(activity.getResources().getColor(com.showcase.faizf.showcase.R.color.blackTrans))
                .show();
    }
}
