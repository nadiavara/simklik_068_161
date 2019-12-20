package id.kuliah.simklik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Button Cari
        val btnCari: Button = findViewById(R.id.btn_cari)
        btnCari.setOnClickListener {
            val intent = Intent(this, CariActivity::class.java)
            startActivity(intent)
        }

        //Button bantuan
        val btnBantuan: Button = findViewById(R.id.btn_bantuan)
        btnBantuan.setOnClickListener {
            val intent = Intent(this, BantuanActivity::class.java)
            startActivity(intent)
        }

        //Button tentang
        val btnTentang: Button = findViewById(R.id.btn_tentang)
        btnTentang.setOnClickListener {
            val intent = Intent(this, TentangActivity::class.java)
            startActivity(intent)
        }
    }
}
