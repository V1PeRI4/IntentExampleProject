package com.example.intentexampleproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentexampleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sms.setOnClickListener{
            val number = binding.number.text.toString()
            val text = binding.message.text.toString()

            val uri: Uri = Uri.parse("smsto:$number",)
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", text)
            startActivity(intent)
//            val smsManager:SmsManager
//            smsManager = this.getSystemService(SmsManager::class.java)
//            smsManager.sendTextMessage(number, null, text, null, null)

//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra(IntentsKey.NAME, name)
//            startActivity(intent)
        }
    }
}

