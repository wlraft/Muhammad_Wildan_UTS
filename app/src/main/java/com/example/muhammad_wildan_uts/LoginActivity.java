package com.example.muhammad_wildan_uts;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muhammad_wildan_uts.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = getIntent().getStringExtra("nama");
                String password = getIntent().getStringExtra("password");
                String email = getIntent().getStringExtra("email");

                String lognama = binding.etNama.getText().toString().trim();
                String logpassword = binding.etPassword.getText().toString().trim();

                if (TextUtils.isEmpty(lognama)) {
                    binding.etNama.setError("Nama harus di isi");
                }else if (TextUtils.isEmpty(logpassword)) {
                    binding.etPassword.setError("Password harus di isi");
                }

                if (lognama.equals(nama) && logpassword.equals(password)) {
                    Intent login = new Intent(LoginActivity.this, MainActivity.class);
                    login.putExtra("nama", nama);
                    login.putExtra("password", password);
                    login.putExtra("email", email);
                    startActivity(login);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "Nama atau password salah", Toast.LENGTH_SHORT).show();
                }







            }
        });

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(login);
            }
        });

        binding.tvLpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Fitur ini masih belum ada", Toast.LENGTH_SHORT).show();
            }
        });


    }
}