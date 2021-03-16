package org.jangtechtown.study_20210316

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoveButton.setOnClickListener {

            val inPutId = IdBtn.text.toString()
            val inPutPw = PwBtn.text.toString()

            if (inPutId == "aslk3366zz" && inPutPw == "hyejin") {

                val myIntent = Intent(this, SecondActivity::class.java)

                startActivity(myIntent)
            } else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()

            }
        }

    }
}