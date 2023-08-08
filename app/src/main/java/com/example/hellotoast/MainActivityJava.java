package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hellotoast.databinding.ActivityMainBinding;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int number = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.txtNumber.setText(String.valueOf(number));
        // increment number and set txtNumber
        binding.btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number++;
                binding.txtNumber.setText(String.valueOf(number));
            }
        });
        // show toast
        binding.btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityJava.this, "Count " + number, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


