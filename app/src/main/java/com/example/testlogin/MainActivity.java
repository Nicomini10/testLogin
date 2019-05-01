package com.example.testlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    Button button;
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String code = editText.getText().toString();
                if(!code.equals("")){
                    for(int i = 0; i < Database.codesPassword.length; i++ ){
                        if(code.equals(Database.codesPassword[i])) {
                            //enter the app
                            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            textView.setText("Wrong Password");
                        }
                    }
                }

                String code2 = editText2.getText().toString();
                if(!code2.equals("")){
                    for(int i = 0; i < Database.codesEmail.length; i++){
                        if(code2.equals(Database.codesEmail[i])) {

                            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                            startActivity(intent);
                            finish();
                        }else textView2.setText("Wrong Email");
                    }
                }


            }
        });

    }
}
