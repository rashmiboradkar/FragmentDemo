package com.alivetech.fragmentdemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginFragment extends Fragment {

    MaterialButton login;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_login, container, false);
        login= view.findViewById(R.id.btnLogin);
        this.login.setOnClickListener(this::showAlert);
        return view;
    }

    private void showAlert(View view) {

        AlertDialog.Builder builder= new AlertDialog.Builder(getContext());
        builder.setTitle("Login Here...");
        builder.setMessage("You can Login Here......");
        builder.setCancelable(false);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(),"Login Success..",Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }
}