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
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class ExpandableExampleActivity extends AppCompatActivity {
    private static final String FRAGMENT_TAG_DATA_PROVIDER = "data provider";
    private static final String FRAGMENT_LIST_VIEW = "list view";

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        ArrayList<State> states = new ArrayList<>();

        ArrayList<String> blocks1 = new ArrayList<>();
        blocks1.add("g1");
        blocks1.add("g2");
        blocks1.add("g3");
        State state1 = new State("Greeting", "12:20", blocks1);

        ArrayList<String> blocks2 = new ArrayList<>();
        blocks2.add("s1");
        blocks2.add("s2");
        blocks2.add("s3");
        blocks2.add("s4");
        State state2 = new State("Shaking head", "12:30", blocks2);

        ArrayList<String> blocks3 = new ArrayList<>();
        blocks3.add("g1");
        State state3 = new State("Goodbye", "12:30", blocks3);

        states.add(state1);
        states.add(state2);
        states.add(state3);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(ExampleExpandableDataProviderFragment.newInstance(states), FRAGMENT_TAG_DATA_PROVIDER)
                    .commit();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ExpandableExampleFragment(), FRAGMENT_LIST_VIEW)
                    .commit();
        }


        mButton = findViewById(R.id.submit_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Iterator hmIterator = ExpandableExampleAdapter.map.entrySet().iterator();

                // Iterate through the hashmap
                // and add some bonus marks for every student
                //System.out.println("HashMap after adding bonus marks:");

                while (hmIterator.hasNext()) {
                    Map.Entry mapElement = (Map.Entry)hmIterator.next();
                    //int marks = ((int)mapElement.getValue() + 10);
                    Log.d("hashmap",mapElement.getKey() + " : " + mapElement.getValue());
                }

            }
        });
    }



    public AbstractExpandableDataProvider getDataProvider() {
        final Fragment fragment = getSupportFragmentManager().findFragmentByTag(FRAGMENT_TAG_DATA_PROVIDER);
        return ((ExampleExpandableDataProviderFragment) fragment).getDataProvider();
    }


}
