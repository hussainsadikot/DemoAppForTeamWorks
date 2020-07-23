package com.example.android.demoappforteamworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonSignUp,buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSignUp =findViewById(R.id.sign_up_button);

        buttonSignIn =findViewById(R.id.sign_in_button);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goto signup form
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //goto signin form
                startActivity(new Intent(MainActivity.this, SignInActivity.class));
            }
        });




    }
}
