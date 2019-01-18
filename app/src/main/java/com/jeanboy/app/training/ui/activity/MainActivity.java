package com.jeanboy.app.training.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jeanboy.app.training.R;
import com.jeanboy.app.training.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected String getTAG() {
        return MainActivity.class.getSimpleName();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toActivity(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }

    public void toFragment(View view) {
        startActivity(new Intent(this, FragmentActivity.class));
    }

    public void toService(View view) {
        startActivity(new Intent(this, ServiceActivity.class));
    }

    public void toBroadcast(View view) {
        startActivity(new Intent(this, BroadcastActivity.class));
    }

    public void toContentProvider(View view) {
        startActivity(new Intent(this, ContentProviderActivity.class));
    }

    public void toRemoteView(View view) {
        startActivity(new Intent(this, RemoteViewActivity.class));
    }
}
