package com.example.user.khabarshabar;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class user_profile_scrolling extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_scrolling);
    }

    public void goToNavigationDrawer(View view){
        Intent i = new Intent(user_profile_scrolling.this, navigation_drawer.class);
        startActivity(i);
    }
}
