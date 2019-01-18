package com.jeanboy.app.training.ui.activity;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.jeanboy.app.training.R;
import com.jeanboy.app.training.base.BaseActivity;

public class ContentProviderActivity extends BaseActivity {


    private Uri uriUser = Uri.parse("content://com.jeanboy.myprovider/user");

    @Override
    protected String getTAG() {
        return ContentProviderActivity.class.getSimpleName();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider);
    }

    public void toInsert(View view) {
        ContentValues values = new ContentValues();
        values.put("id", 3);
        values.put("name", "张三");
        ContentResolver resolver = getContentResolver();
        resolver.insert(uriUser, values);
    }

    public void toUpdate(View view) {
    }

    public void toSelect(View view) {
        ContentResolver resolver = getContentResolver();
        Cursor cursor = resolver.query(uriUser, new String[]{"id", "name"}, null, null, null);
        while (cursor.moveToNext()) {
            Log.e(TAG, "=========== query :" + cursor.getInt(0) + "==" + cursor.getString(1));
        }
        cursor.close();
    }

    public void toDelete(View view) {
    }
}
