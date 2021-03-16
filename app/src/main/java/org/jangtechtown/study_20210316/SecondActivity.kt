package org.jangtechtown.study_20210316

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        SecondMoveBtn.setOnClickListener {

            val MyIntent = Intent(this, MainActivity::class.java)


            startActivity(MyIntent)

        }
    }
}