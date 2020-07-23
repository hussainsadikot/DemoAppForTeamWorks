package com.example.android.demoappforteamworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    private EditText InputEmail,Inputpassword;
    private Button LoginButton, BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        InputEmail = findViewById(R.id.et_email_signin);
        Inputpassword = findViewById(R.id. et_pwd_signin);
        LoginButton = findViewById(R.id.sign_in_button_In_SignIn_activity);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {

        String email = InputEmail.getText().toString().trim();
        String password = Inputpassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please Write Your Number", Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please Write Password ", Toast.LENGTH_SHORT).show();
        }
        else {
//            ValidateCredential(email,password);
            Toast.makeText(SignInActivity.this, " Successfully Logged In...", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(SignInActivity.this, HomeActivity.class));

        }


    }

    private void ValidateCredential(String email, String password) {



    }

}
