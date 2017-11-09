package com.example.ekasilabalexcdtb.viewpagers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eKasiLab Alex CDTB on 18 Jul 2017.
 */

public class FragmentC extends Fragment {

        public FragmentC() {
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_view, container, false);

            TextView tv = (TextView)view.findViewById(R.id.textview);
            tv.setText("Fragment C");
            return  view;
        }


}
