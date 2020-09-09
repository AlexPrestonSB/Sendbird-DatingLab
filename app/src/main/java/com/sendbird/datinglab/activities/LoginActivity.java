package com.sendbird.datinglab.activities;


import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sendbird.datinglab.R;


public class LoginActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        EditText etUserId = findViewById(R.id.etUserId);
        EditText etNickname = findViewById(R.id.etNickname);

        etUserId.setSelectAllOnFocus(true);
        etNickname.setSelectAllOnFocus(true);

        /**
         * TODO SENDBIRD
         */
        findViewById(R.id.btSignIn).setOnClickListener(v -> {

        });
    }
}
