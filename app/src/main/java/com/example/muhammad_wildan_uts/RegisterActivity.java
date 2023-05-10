package com.example.muhammad_wildan_uts;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muhammad_wildan_uts.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = binding.etRegnama.getText().toString().trim();
                String email = binding.etRegemail.getText().toString().trim();
                String password = binding.etRegpassword.getText().toString().trim();

                if (TextUtils.isEmpty(nama)) {
                    binding.etRegnama.setError("Nama harus di isi");
                }else if (TextUtils.isEmpty(email)) {
                    binding.etRegemail.setError("Email harus di isi");
                } else if (TextUtils.isEmpty(password)) {
                    binding.etRegpassword.setError("Password harus di isi");
                }else{
                    Intent register = new Intent(RegisterActivity.this, RegisterSuccessActivity.class);
                    register.putExtra("nama", nama);
                    register.putExtra("email", email);
                    register.putExtra("password", password);
                    startActivity(register);
                    finish();


                }
            }
        });

        binding.tvPunyaAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(RegisterActivity.this, "Fitur ini masih belum ada", Toast.LENGTH_SHORT).show();
                Intent Pakun = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(Pakun);
            }
        });




    }
}