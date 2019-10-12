package com.example.atravelbill.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atravelbill.R;
import com.example.atravelbill.basic.Hints;
import com.example.atravelbill.model.Settings;
import com.example.atravelbill.utils.SettingUtil;


public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;

    private Button loginButton;

    private String username;

    private void findComponents(){
        usernameEditText=findViewById(R.id.usernameEditText);
        loginButton=findViewById(R.id.loginButton);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findComponents();
        String tempUsername = (String) SettingUtil.readSharedPreferences(this, Settings.username);
        if (!Hints.EMPTY.getName().equals(tempUsername)) {
//            toTripsActivity();
        }
        loginButton.setClickable(false);
        loginButton.setPressed(true);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = usernameEditText.getText().toString();
                if (username.trim().isEmpty()) {
                    loginButton.setClickable(false);
                    loginButton.setPressed(true);
                    return;
                }
                SettingUtil.writeSharedPreferences(LoginActivity.this, Settings.username, username);
                toTripsActivity();
            }
        });
        usernameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().trim().isEmpty()) {
                    setButtonUsable(true);
                } else {
                    setButtonUsable(false);
                }
            }
        });
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        username = usernameEditText != null ? usernameEditText.getText().toString() : null;
        if (null == username || username.trim().isEmpty()) {
            setButtonUsable(false);
        } else {
            setButtonUsable(true);
        }
    }

    void setButtonUsable(boolean b) {
        if (null != loginButton) {
            loginButton.setClickable(b);
            loginButton.setPressed(!b);
        }
    }

    void toTripsActivity() {
        LoginActivity.this.finish();
        Intent intent = new Intent(LoginActivity.this, TripsActivity.class);
        startActivity(intent);
    }
}
