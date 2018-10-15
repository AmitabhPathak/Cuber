package com.university.cuber.cuber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button mDriver, mRider;
private FirebaseAuth mAuth
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDriver=(Button) findViewById(R.id.driver);
        mRider=(Button) findViewById(R.id.rider);
                mDriver.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(MainActivity.this,DriverLoginActivity.class);
                                startActivity();
                                        finish();
                                        return;
                    }
                });
    }
}
