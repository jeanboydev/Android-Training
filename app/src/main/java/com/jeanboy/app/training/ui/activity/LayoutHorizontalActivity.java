package com.jeanboy.app.training.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;

import com.jeanboy.app.training.R;
import com.jeanboy.app.training.base.BaseActivity;
import com.jeanboy.app.training.ui.adapter.TestRecyclerViewAdapter;
import com.jeanboy.app.training.ui.layoutmanger.HorizontalLayoutManger;

import java.util.ArrayList;
import java.util.List;

public class LayoutHorizontalActivity extends BaseActivity {

    @Override
    protected String getTAG() {
        return LayoutHorizontalActivity.class.getSimpleName();
    }

    private RecyclerView rv_container;
    private TestRecyclerViewAdapter adapter;
    private List<String> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_horizontal);
        rv_container = findViewById(R.id.rv_container);
        adapter = new TestRecyclerViewAdapter(dataList);
//        rv_container.setLayoutManager(new LinearLayoutManager(this));
//        rv_container.setLayoutManager(new FlowLayoutManager());
        rv_container.setLayoutManager(new HorizontalLayoutManger());
        rv_container.setAdapter(adapter);
        //设置分隔线
//        rv_container.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
//        rv_container.addItemDecoration(new FixedItemDecoration(this));
        //设置增加或删除条目的动画
        rv_container.setItemAnimator(new DefaultItemAnimator());


        for (int i = 0; i < 20; i++) {
            dataList.add("这是标题" + i);
        }
        adapter.notifyDataSetChanged();
    }
}
