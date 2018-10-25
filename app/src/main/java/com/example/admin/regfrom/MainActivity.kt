package com.example.admin.regfrom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button1.setOnClickListener{
            val intent = Intent(this,Main2Activity: :class.java)
            startActivity (intent)
            Button1.setOnClickListener {
                if (usernameField.text.toString().isEmpty() or mailField.text.toString().isEmpty() or firstPasswordField.text.toString().isEmpty() or secondPasswordField.text.toString().isEmpty()  or !email.text.toString().contains("@"))
                    Toast.makeText(this, "something gone wrond" , Toast.LENGTH_LONG).show()
                else
                    Toast.makeText(this, "good job", Toast.LENGTH_LONG).show()
        }
    }
}
