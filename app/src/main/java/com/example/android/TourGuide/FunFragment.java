/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.TourGuide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of tours
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.cnk, R.string.cnk_address,
                R.drawable.cnk));
        tours.add(new Tour(R.string.bw, R.string.bw_address,
                R.drawable.bw));
        tours.add(new Tour(R.string.fontanny, R.string.fontanny_address,
                R.drawable.fontanny));
        tours.add(new Tour(R.string.legia, R.string.legia_address,
                R.drawable.legia));
        tours.add(new Tour(R.string.teatr, R.string.teatr_address,
                R.drawable.teatr_wielki));
        tours.add(new Tour(R.string.zoo, R.string.zoo_address,
                R.drawable.zoo));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_fun);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
