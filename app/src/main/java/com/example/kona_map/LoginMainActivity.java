package com.example.kona_map;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginMainActivity extends AppCompatActivity {
    Button btn1;//先声明哦
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//给btn1，btn2赋值，即设置布局文件中的Button按钮id进行关联
        btn1 = (Button) findViewById(R.id.btn_login);
        //为button绑定事件
        final EditText usernameEditText = findViewById(R.id.et_user_name);
        final EditText passwordEditText = findViewById(R.id.et_psw);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginMainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
