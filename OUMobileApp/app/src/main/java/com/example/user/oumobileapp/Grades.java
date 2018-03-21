package com.example.user.oumobileapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jonathan Lacoursiere on 3/10/2018.
 */

public class Grades extends Activity {

    private TextView tvSemester, tvClass1, tvClass2,tvClass3, tvGrade1, tvGrade2, tvGrade3;
    private Button btnSetSemester, btnGrades;
    private String semesterText;


    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grades);

        tvSemester = (TextView) findViewById(R.id.tvSemester);

        btnGrades = (Button) findViewById(R.id.btnGrades);
        btnSetSemester = (Button) findViewById(R.id.btnSetSemester);

        tvClass1 = (TextView) findViewById(R.id.tvClass1);
        tvClass2 = (TextView) findViewById(R.id.tvClass2);
        tvClass3 = (TextView) findViewById(R.id.tvClass3);

        tvGrade1 = (TextView) findViewById(R.id.tvGrade1);
        tvGrade2 = (TextView) findViewById(R.id.tvGrade2);
        tvGrade3 = (TextView) findViewById(R.id.tvGrade3);
    }

    public void setSemester(View view){
        AlertDialog.Builder newSemester = new AlertDialog.Builder(Grades.this);
        newSemester.setTitle("Select Semester");

       // final EditText input = new EditText(this);
       // input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
      //  newSemester.setView(input);
        final String[] semesters = {"Fall 2018", "Winter 2018"};
        newSemester.setItems(semesters, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                switch(i){
                    case 0:
                        semesterText = semesters[i].toUpperCase();
                        tvSemester.setText(semesterText);
                    case 1:
                        semesterText = semesters[i].toUpperCase();
                        tvSemester.setText(semesterText);
                }
            }
        });

  /*      newSemester.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    semesterText = input.getText().toString().toUpperCase();
                    tvSemester.setText(semesterText);
            }
        });
        newSemester.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        }); */


        newSemester.show();
        tvSemester.setText(" ");
        tvClass1.setText(" ");
        tvGrade1.setText(" ");
        tvClass2.setText(" ");
        tvGrade2.setText(" ");
        tvClass3.setText(" ");
        tvGrade3.setText(" ");
    }

    public void getGrades(View view){
        if (semesterText.contains("FALL 2018")){
            tvClass1.setText("CSI 2999");
            tvGrade1.setText("3.5");
            tvClass2.setText("CSI 2500");
            tvGrade2.setText("3.2");
            tvClass3.setText("MGT 1100");
            tvGrade3.setText("3.0");
        }

        else{
            tvSemester.setText(" ");
            tvClass1.setText(" ");
            tvGrade1.setText(" ");
            tvClass2.setText(" ");
            tvGrade2.setText(" ");
            tvClass3.setText(" ");
            tvGrade3.setText(" ");
            AlertDialog.Builder noSemester = new AlertDialog.Builder(Grades.this);
            noSemester.setTitle("Not a Valid Semester");
            noSemester.setMessage("You don't have any grades for that semester.");
            noSemester.show();
        }
    }
}
