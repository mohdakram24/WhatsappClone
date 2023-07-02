package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.whatsapp.databinding.ActivityChatDeatilsBinding;

public class ChatDeatilsActivity extends AppCompatActivity {

    ActivityChatDeatilsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatDeatilsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}