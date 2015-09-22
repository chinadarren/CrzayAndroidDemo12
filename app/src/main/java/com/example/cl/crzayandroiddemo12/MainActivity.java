package com.example.cl.crzayandroiddemo12;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.QuickContactBadge;


public class MainActivity extends Activity {

    QuickContactBadge badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //获取QuickContactBadge组件
        badge = (QuickContactBadge) findViewById(R.id.badge);
        //将QuickContactBadge组件与特定电话号码对应的联系人建立关联
        badge.assignContactFromPhone("202-88888888",false);
    }

}
