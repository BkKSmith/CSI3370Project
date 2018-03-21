package com.example.user.oumobileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }
    public void testLogin(View view){
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        String type = "login";

        /* need this to change to initite*/
        Background background = new Background(this);
        background.execute(type, username, password);
       /* if(Background.testValue.equals("login success")){
            Intent i = new Intent(MainActivity.this, Home.class);
            startActivity(i);
        }*/
       /* if((username.equals("test")) && (password.equals("one"))){
            Intent i = new Intent(MainActivity.this, Home.class);
            startActivity(i);
        }
        else{
            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("Enter Valid Username or Password");
            builder1.setCancelable(true);

            builder1.show();
        }*/



    }
    public void ResetPassword(View view){
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        String type = "login";

        changeLogin changeLogin = new changeLogin(this);
        changeLogin.execute(type, username, password);
    }
}
