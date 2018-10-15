package com.university.cuber.cuber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DriverLoginActivity extends AppCompatActivity {
    private EditText memail,mpassword;
    private Button mlogin, mregistration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);
        memail=(EditText) findViewById(R.id.email);
        mpassword=(EditText) findViewById(R.id.password);
        mlogin=(Button) findViewById(R.id.login);
        mregistration=(Button) findViewById(R.id.registration);
    }
}
