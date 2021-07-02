package com.example.call_managment_system;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etUsername,etPassword;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R .id.et_password);
        btSubmit = findViewById(R.id.bt_login);



        btSubmit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                if((etUsername.getText().toString()).isEmpty() ||
                        (etPassword.getText().toString()).isEmpty()) {
                    Toast.makeText(Login.this, "Please fill out Username and Password !!!",
                            5000).show();
                }
                else {

                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            Login.this);
                    builder.setIcon(R.drawable.ic_check);
                    builder.setTitle("Login Successfully !!!");
                    builder.setMessage("Welcome To Call Managment System");

                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
               /* else
                    Toast.makeText(getApplicationContext(),"INVAILD Username & Password",Toast.LENGTH_SHORT).show();*/

            }
        });
    }
}