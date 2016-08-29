package com.github.mzule.layoutannotation.sample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.github.mzule.layoutannotation.Layout;
import com.github.mzule.layoutannotation.sample.base.BaseActivity;

@Layout(R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragment, new MainFragment()).commit();
    }
}
