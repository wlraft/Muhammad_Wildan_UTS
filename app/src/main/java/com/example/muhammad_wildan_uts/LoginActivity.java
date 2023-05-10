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
                // Mengambil String/inputan text dari edittext
                String lognama = getIntent().getStringExtra("nama");
                binding.etNama.setText(lognama);
                String email = getIntent().getStringExtra("email");
                String logpassword = getIntent().getStringExtra("password");
                binding.etPassword.setText(logpassword);


                // Mengvalidasi inputan
                if (TextUtils.isEmpty(lognama)) {
                    binding.etNama.setError("Nama harus di isi");
                }else if (TextUtils.isEmpty(logpassword)) {
                    binding.etPassword.setError("Password harus di isi");
                }else{
                    Intent login = new Intent(LoginActivity.this, MainActivity.class);
                    login.putExtra("lognama", binding.etNama.getText().toString());
                    login.putExtra("logpassword", binding.etPassword.getText().toString());
                    login.putExtra("logemail", email);
                    startActivity(login);
                    finish();
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