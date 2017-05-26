package com.example.baibhav.fragmentegdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_loginbutton;
    Button btn_registerbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_loginbutton=(Button) findViewById(R.id.loginbutton);
        btn_registerbutton=(Button) findViewById(R.id.registerbutton);

        btn_loginbutton.setOnClickListener(this);
        btn_registerbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.loginbutton:
                showloginfragment();
                break;

            case R.id.registerbutton:
                showregisterfragment();
                break;

            default:
                showloginfragment();
                break;
        }
    }

    private void showloginfragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameinmain,new RegisterFragment()).commit();
    }

    private void showregisterfragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameinmain, new LoginFragment()).commit();
    }
}
