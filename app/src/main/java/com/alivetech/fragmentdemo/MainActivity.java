package com.alivetech.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();
        this.login.setOnClickListener(this::loginmethod);
        this.register.setOnClickListener(this::registerMethod);
    }

    private void registerMethod(View view) {
        RegisterFragment registerFragment=new RegisterFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,registerFragment)
                .commit();
    }
    private void loginmethod(View view){
        LoginFragment loginFragment = new LoginFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, loginFragment)
                    .commit();
        }

    private void initialise() {

        login = findViewById(R.id.btnLogin);
        register = findViewById(R.id.btnRegister);


    }
}