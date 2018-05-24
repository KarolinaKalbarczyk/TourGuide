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
import java.util.List;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of tours
        List<Tour> tours = new ArrayList<>();
        tours.add(new Tour(R.string.amber_room,  R.string.amber_room_address,
                R.drawable.amber_room));
        tours.add(new Tour(R.string.dom_polski_restaurant, R.string.dom_polski_restaurant_address,
                R.drawable.dom_polski_restaurant));
        tours.add(new Tour(R.string.gosciniec, R.string.gosciniec_address,
                R.drawable.gosciniec_polskie_pierogi));
        tours.add(new Tour(R.string.kuchnia_warszawska, R.string.kuchnia_warszawska_address,
                R.drawable.kuchnia_warszawska));
        tours.add(new Tour(R.string.prodiz_warszawski, R.string.prodiz_warszawski_address,
                R.drawable.prodiz_warszawski));
        tours.add(new Tour(R.string.skamiejka, R.string.skamiejka_address,
                R.drawable.skamiejka));
        tours.add(new Tour(R.string.stara_kamienica, R.string.stara_kamienica_address,
                R.drawable.stara_kamienica));
        tours.add(new Tour(R.string.stolica, R.string.stolica_address,
                R.drawable.stolica));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_eat);

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
