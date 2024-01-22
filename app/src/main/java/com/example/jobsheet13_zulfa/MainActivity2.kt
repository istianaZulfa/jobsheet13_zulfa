package com.example.jobsheet13_zulfa

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity2 : AppCompatActivity() {
    private lateinit var namaView: TextView
    private lateinit var kelasView: TextView
    private lateinit var NisView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        namaView = findViewById(R.id.namaView)
        kelasView = findViewById(R.id.kelasView)
        NisView = findViewById(R.id.NisView)
        val extras = intent.extras
        namaView.text = extras?.getString("nama")
        kelasView.text = extras?.getString("kelas")
        NisView.text = extras?.getString("Nis")
    }
}