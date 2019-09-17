package com.obito.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.obito.Basic.Hints;
import com.obito.R;
import com.obito.model.Settings;
import com.obito.utils.SettingUtil;
import com.obito.utils.ToastUtil;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;

    private Button loginButton;

    private String username;

    private void findComponents(){
        usernameEditText= findViewById(R.id.usernameTextView);
        loginButton= findViewById(R.id.loginButton);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String tempUsername=(String) SettingUtil.readSharedPreferences(this,Settings.username);
        if(!Hints.EMPTY.getName().equals(tempUsername)){
            toTripsActivity();
        }
        findComponents();
        loginButton.setClickable(false);
        loginButton.setPressed(true);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username=usernameEditText.getText().toString();
                if(username.trim().isEmpty()){
                    ToastUtil.showToast(LoginActivity.this, Hints.ERROR_USERNAME.getName());
                    return;
                }
                SettingUtil.writeSharedPreferences(LoginActivity.this, Settings.username,username);
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
                if(!editable.toString().trim().isEmpty()){
                    loginButton.setClickable(true);
                    loginButton.setPressed(false);
                }else{
                    loginButton.setClickable(false);
                    loginButton.setPressed(true);
                }
            }
        });
    }

    void toTripsActivity(){
        LoginActivity.this.finish();
        Intent intent=new Intent(LoginActivity.this,TripsActivity.class);
        startActivity(intent);
    }
    
}
