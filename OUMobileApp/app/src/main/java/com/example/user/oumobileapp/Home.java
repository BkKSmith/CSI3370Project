package com.example.user.oumobileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jonathan Lacoursiere on 3/6/2018.
 */

public class Home extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }
public void openActivity(View view){
        String btnText;
        btnText = ((Button) view).getText().toString();
        if(btnText.equals("Grades")) {
            Intent i = new Intent(this, Grades.class);
            startActivity(i);
        }
    }


public void   getGrizzID(View view){
    String username = "tester@tester.com";
    String password = "shouldnt_need";
    String type = "login";

    getGrizz getGrizz = new getGrizz(this);
    getGrizz.execute(type, username, password);

}
}
