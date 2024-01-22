package com.example.jobsheet13_zulfa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var NisEdit: EditText
    private lateinit var submitBtn: Button

    private val NAME_KEY: String = "nama"
    private val Class_KEY: String = "kelas"
    private val Nis_KEY: String = "Nis"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        namaEdit = findViewById(R.id.namaEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        NisEdit = findViewById(R.id.NisEdit)
        submitBtn = findViewById(R.id.submitBtn)
        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(Class_KEY, kelasEdit.text.toString())
            intent.putExtra(Nis_KEY, NisEdit.text.toString())
            startActivity(intent)
        }
    }
}