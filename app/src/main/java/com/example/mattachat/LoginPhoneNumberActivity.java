  package com.example.mattachat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPhoneNumberActivity extends AppCompatActivity {

    EditText phoneInput;
    Button sendOtpBtn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);
        phoneInput = findViewById(R.id.login_mobile_number);
        sendOtpBtn = findViewById(R.id.send_otp_btn);
        progressBar = findViewById(R.id.login_progress_bar);



        progressBar.setVisibility(View.GONE);

        sendOtpBtn.setOnClickListener((v)-> {
            String phno = "8825425389";
            phno = phoneInput.getText().toString();

            if (phno.isEmpty()) {
                Toast.makeText(getApplicationContext(), phno, Toast.LENGTH_SHORT).show();
                phoneInput.setError("Phone number is required");
                return;
            }
//            Toast.makeText(getApplicationContext(), phno, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginPhoneNumberActivity.this, LoginOtpActivity.class);


            startActivity(intent);

        });



    }
}