package com.sanpedro.sanpedroamielexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sanpedro.sanpedroamielexam2.Main2Activity;
import com.sanpedro.sanpedroamielexam2.R;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1 , cb2 , cb3 , cb4 , cb5 , cb6 , cb7 , cb8;
    EditText commentBox;


    private static final String fileName = "subjects.txt";
    private static final String comment = "comment.txt";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);
        cb5 = findViewById(R.id.checkBox5);
        cb6 = findViewById(R.id.checkBox6);
        cb7 = findViewById(R.id.checkBox7);
        cb8 = findViewById(R.id.checkBox8);
        commentBox = findViewById(R.id.editText);
    }

    public void saveButton(View v) {
        String subjectString = "";

        if(cb1.isChecked())
        {
            String text=cb1.getText().toString();
            subjectString = subjectString + "\n" + text + "\n";
        }
        if(cb2.isChecked())
        {
            String text=cb2.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(cb3.isChecked())
        {
            String text=cb3.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(cb4.isChecked())
        {
            String text=cb4.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(cb5.isChecked())
        {
            String text=cb5.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(cb6.isChecked())
        {
            String text=cb6.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(cb7.isChecked())
        {
            String text=cb7.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(cb8.isChecked())
        {
            String text=cb8.getText().toString();
            subjectString = subjectString + text;
        }

        String comment = commentBox.getText().toString();

        FileOutputStream fos;
        FileOutputStream fos2;
        try {
            fos = openFileOutput("subjects.txt", MODE_PRIVATE);
            OutputStreamWriter out = new OutputStreamWriter(fos);
            out.write(subjectString);
            out.close();
            fos.close();
            fos2 = openFileOutput("comment.txt", MODE_PRIVATE);
            OutputStreamWriter out2 = new OutputStreamWriter(fos2);
            out2.write(comment);
            out2.close();
            fos2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Toast.makeText(this, "Data Saved..." , Toast.LENGTH_LONG).show();
    }

    public void nextPage(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

}