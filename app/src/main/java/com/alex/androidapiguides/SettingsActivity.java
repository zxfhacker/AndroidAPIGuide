package com.alex.androidapiguides;

import android.os.Bundle;

/**
 * Created by alex on 15-4-24.
 *
 */
public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        changeTitle();
    }
}
