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
                String Registernama = binding.etRegnama.getText().toString().trim();
                String Registeremail = binding.etRegemail.getText().toString().trim();
                String Registerpassword = binding.etRegpassword.getText().toString().trim();

                if (TextUtils.isEmpty(Registernama)) {
                    binding.etRegnama.setError("Nama harus di isi");
                }else if (TextUtils.isEmpty(Registeremail)) {
                    binding.etRegemail.setError("Email harus di isi");
                } else if (TextUtils.isEmpty(Registerpassword)) {
                    binding.etRegpassword.setError("Password harus di isi");
                }else{
                    Intent register = new Intent(RegisterActivity.this, RegisterSuccessActivity.class);
                    register.putExtra("registernama", Registernama);
                    register.putExtra("registeremail", Registeremail);
                    register.putExtra("registerpassword", Registerpassword);
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