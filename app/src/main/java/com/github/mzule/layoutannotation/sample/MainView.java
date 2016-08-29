package com.github.mzule.layoutannotation.sample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.github.mzule.layoutannotation.Layout;
import com.github.mzule.layoutannotation.LayoutBinder;

/**
 * Created by CaoDongping on 8/29/16.
 */

@Layout(R.layout.view_main)
public class MainView extends LinearLayout {
    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutBinder.bind(this);
    }
}
