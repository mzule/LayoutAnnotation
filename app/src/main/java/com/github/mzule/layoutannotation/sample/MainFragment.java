package com.github.mzule.layoutannotation.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mzule.layoutannotation.Layout;
import com.github.mzule.layoutannotation.LayoutBinder;

/**
 * Created by CaoDongping on 8/29/16.
 */

@Layout(R.layout.fragment_main)
public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return LayoutBinder.inflate(this);
    }
}
