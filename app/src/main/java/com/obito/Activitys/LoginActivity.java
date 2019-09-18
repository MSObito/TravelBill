package com.obito.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.obito.Basic.Hints;
import com.obito.R;
import com.obito.model.Settings;
import com.obito.utils.SettingUtil;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.usernameTextView)
    private EditText usernameEditText;

    @BindView(R.id.loginButton)
    private Button loginButton;

    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
