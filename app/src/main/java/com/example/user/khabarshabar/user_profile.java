package com.example.user.khabarshabar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class user_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }

    public void goToScrolling(View view){
        Intent i = new Intent(user_profile.this, user_profile_scrolling.class);
        startActivity(i);
    }
}
