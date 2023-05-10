package com.example.muhammad_wildan_uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muhammad_wildan_uts.databinding.ActivityRegisterSuccessBinding;

public class RegisterSuccessActivity extends AppCompatActivity {


    ActivityRegisterSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLoginsuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = getIntent().getStringExtra("nama");
                String email = getIntent().getStringExtra("email");
                String password = getIntent().getStringExtra("password");


                Intent registersuccess = new Intent(RegisterSuccessActivity.this, LoginActivity.class);
                registersuccess.putExtra("nama", nama);
                registersuccess.putExtra("email", email);
                registersuccess.putExtra("password", password);
                startActivity(registersuccess);
                finish();

            }
        });
    }
}