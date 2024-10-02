package com.example.assignment_3;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    LinearLayout first_layout,second_layout;
    private TextView outputText;
    private EditText eamil,pass;
    private Button login;
    private String name,password;
    private Pattern emailPattern = Pattern.compile("[a-zA-z]");
    private Pattern passPattern = Pattern.compile("^(?=.*[a-z])(?=.*\\d)[a-zA-Z\\d]{6,}$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
}