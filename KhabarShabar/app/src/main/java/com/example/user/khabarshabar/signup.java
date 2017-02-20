package com.example.user.khabarshabar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    String emailInput;
    String passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void goOnClick(View view){
        EditText emailInputField = (EditText) findViewById(R.id.emailField);
        EditText passwordField = (EditText) findViewById(R.id.passwordField);
        emailInput = emailInputField.getText().toString();
        passwordInput = passwordField.getText().toString();

        Intent i = new Intent(signup.this, user_profile.class);
        startActivity(i);
    }

    public void goToSignUp(View view){
        Intent i = new Intent(signup.this, login.class);
        startActivity(i);
    }
}
