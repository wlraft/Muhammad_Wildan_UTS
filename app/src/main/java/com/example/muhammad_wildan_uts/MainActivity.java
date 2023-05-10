package com.example.muhammad_wildan_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.muhammad_wildan_uts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String dataNama = getIntent().getStringExtra("nama");
        String dataEmail = getIntent().getStringExtra("email");
        String dataPassword = getIntent().getStringExtra("password");

        binding.tvNamamain.setText(dataNama);
        binding.tvEmailmain.setText(dataEmail);
        binding.tvPasswordmain.setText(dataPassword);






    }
}