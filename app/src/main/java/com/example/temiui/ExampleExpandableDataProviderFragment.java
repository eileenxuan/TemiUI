/*
 *    Copyright (C) 2015 Haruki Hasegawa
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.example.temiui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ExampleExpandableDataProviderFragment extends Fragment {
    private ExampleExpandableDataProvider mDataProvider;
    private ArrayList<State> states;

    public static ExampleExpandableDataProviderFragment newInstance (ArrayList<State> states){
        ExampleExpandableDataProviderFragment fragment = new ExampleExpandableDataProviderFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("STATES", states);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        states = (ArrayList<State>) getArguments().getSerializable(
                "STATES");

        super.onCreate(savedInstanceState);

        setRetainInstance(true);  // keep the mDataProvider instance



        mDataProvider = new ExampleExpandableDataProvider(states);
        //mDataProvider = new ExampleExpandableDataProvider();
    }

    public AbstractExpandableDataProvider getDataProvider() {
        return mDataProvider;
    }
}
