package com.elenamc.loginfb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.AccessToken;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    if(AccessToken.getCurrentAccessToken() == null)
    {
        goLoginScreen();

    }

    }

    protected void goLoginScreen(){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);

    }
}
