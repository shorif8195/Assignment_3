package com.example.assignment_3;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
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
    private EditText email,pass;
    private Button login;
    private String em,password;
    private Pattern emailPattern = Pattern.compile("[a-zA-z]");
    private Pattern passPattern = Pattern.compile("^(?=.*[a-z])(?=.*\\d)[a-zA-Z\\d]{6,}$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        email =(EditText) findViewById(R.id.email_id);
        pass =(EditText) findViewById(R.id.pass_id);
        login = (Button)findViewById(R.id.submit_id);

        first_layout = findViewById(R.id.layout_1);
        second_layout = findViewById(R.id.layout_2);
        outputText = findViewById(R.id.output_text);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                em = email.getText().toString();
                password = pass.getText().toString();

                if(em.isEmpty()){
                    pass.setError("Empty !!.");
                    pass.requestFocus();
                    return;

                }
                else if(!emailPattern.matcher(em).matches()){
                    email.setError("Enter a valid email. ");
                    pass.requestFocus();
                    return;

                };

                if(password.isEmpty()){
                    pass.setError("Empty.");
                    pass.requestFocus();
                    return;
                }
                else if(!passPattern.matcher(password).matches()){
                    pass.setError("Use all type of character .");
                    pass.requestFocus();
                    return;
                };

                first_layout.setVisibility(View.GONE);
                second_layout.setVisibility(View.VISIBLE);
                outputText.setText("Welcome.\n Log in successfully.");








            }
        });







    }
}