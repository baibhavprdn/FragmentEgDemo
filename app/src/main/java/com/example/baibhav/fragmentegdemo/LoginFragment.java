package com.example.baibhav.fragmentegdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Baibhav on 5/26/2017.
 */

public class LoginFragment extends Fragment implements View.OnClickListener {

    EditText username_et;
    EditText password_et;
    Button logindone_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view=inflater.inflate(R.layout.login_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        username_et=(EditText) view.findViewById(R.id.et_username);
        password_et=(EditText) view.findViewById(R.id.et_password);

        logindone_btn=(Button) view.findViewById(R.id.btn_logindone);

        logindone_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Toast.makeText(getActivity(), "Login Button Pressed!", Toast.LENGTH_SHORT).show();

    }
}
