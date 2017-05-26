package com.example.baibhav.fragmentegdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Baibhav on 5/26/2017.
 */

public class RegisterFragment extends Fragment implements View.OnClickListener {

    EditText regusername_et;
    EditText regemail_et;
    EditText regpassword_et;

    Button registerdone_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.register_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        regusername_et=(EditText) view.findViewById(R.id.et_regusername);
        regemail_et=(EditText) view.findViewById(R.id.et_regemail);
        regpassword_et=(EditText) view.findViewById(R.id.et_regpassword);

        registerdone_btn=(Button) view.findViewById(R.id.btn_registerdone);

        registerdone_btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Register Done!!", Toast.LENGTH_SHORT).show();
    }
}
