package com.linw.materialdesigndemo;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.linw.materialdesigndemo.databinding.ActivityScrollerToolBarBinding;

public class ScrollerToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityScrollerToolBarBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_scroller_tool_bar);
        binding.collapsingToolbarLayout.setTitle("滚动标题");
        binding.collapsingToolbarLayout.setExpandedTitleColor(Color.GREEN);
        binding.collapsingToolbarLayout.setCollapsedTitleTextColor(Color.GRAY);
    }
}
