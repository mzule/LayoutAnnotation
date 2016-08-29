package com.github.mzule.layoutannotation.sample.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.github.mzule.layoutannotation.LayoutBinder;

/**
 * Created by CaoDongping on 8/29/16.
 */

public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutBinder.bind(this);
    }
}
