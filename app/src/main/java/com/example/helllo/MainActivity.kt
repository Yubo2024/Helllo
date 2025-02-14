package com.example.helllo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.helllo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 关联 UI 控件
        val etAccount = findViewById<EditText>(R.id.etAccount)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvVersion = findViewById<TextView>(R.id.tvVersion)

        // 登录按钮点击事件
        btnLogin.setOnClickListener {
            val account = etAccount.text.toString()
            val password = etPassword.text.toString()

            if (account.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "账号和密码不能为空！", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
