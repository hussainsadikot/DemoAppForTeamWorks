package com.example.android.demoappforteamworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Collection;

public class SignUpActivity extends AppCompatActivity {
    private Button createaccountButton;
    private EditText InputName,InputEmail,InputPassword,ConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        createaccountButton = findViewById(R.id.register_button);
        InputName = findViewById(R.id.et_name_register);
        InputEmail = findViewById(R.id.et_email_register);
        InputPassword = findViewById(R.id. et_pwd_register);
        ConfirmPassword =findViewById(R.id.et_confirm_pwd_register);
        createaccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateAccount();
            }
        });






    }

    private void CreateAccount() {
        String name = InputName.getText().toString().trim();
        String email = InputEmail.getText().toString().trim();
        String password = InputPassword.getText().toString().trim();
        String confirmPassword = ConfirmPassword.getText().toString().trim();
        if(TextUtils.isEmpty(name)){
            Toast.makeText(this, "Please Write Your Name", Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please Write Your Number", Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please Write Password ", Toast.LENGTH_SHORT).show();
        }
        if(!(password.equals(confirmPassword))){
            Toast.makeText(this, "Confirm password is not same, Please provide same input", Toast.LENGTH_SHORT).show();
        }
        else {
//            checkUserAlreadyRegistered(email,password);
            Toast.makeText(SignUpActivity.this, "Congratulation,Account is created.", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(SignUpActivity.this, SignInActivity.class));

        }


    }
}
