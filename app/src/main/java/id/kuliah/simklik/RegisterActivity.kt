package id.kuliah.simklik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class RegisterActivity : AppCompatActivity() {
    private var mAuth = FirebaseAuth.getInstance()
    private var dbRef = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Component
        val edtNama: EditText = findViewById(R.id.edt_nama_register)
        val edtNoHp: EditText = findViewById(R.id.edt_nomor_hp_register)
        val edtNoKtp: EditText = findViewById(R.id.edt_no_ktp_register)
        val edtAlamat: EditText = findViewById(R.id.edt_alamat_register)
        val edtTglLahir: EditText = findViewById(R.id.edt_tgl_lahir_register)
        val edtUsername: EditText = findViewById(R.id.edt_user_register)
        val edtPassword: EditText = findViewById(R.id.edt_password_register)

        val btnDaftarRegister: Button = findViewById(R.id.btn_daftar_register)
        btnDaftarRegister.setOnClickListener {

            // Ambil data dari form
            val nama = edtNama.text.toString()
            val no_hp = edtNoHp.text.toString()
            val no_ktp = edtNoKtp.text.toString()
            val alamat = edtAlamat.text.toString()
            val tgl_lahir = edtTglLahir.text.toString()
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()

            var isvalid = true

            // Validasi form
            if (nama.isEmpty()) {
                isvalid = false
                edtNama.error = "Nama harus diisi"
            }
            if (no_hp.isEmpty()) {
                isvalid = false
                edtNoHp.error = "No.HP harus diisi"
            }
            if (no_ktp.isEmpty()) {
                isvalid = false
                edtNoKtp.error = "No.KTP harus diisi"
            }
            if (alamat.isEmpty()) {
                isvalid = false
                edtAlamat.error = "Alamat harus diisi"
            }
            if (tgl_lahir.isEmpty()) {
                isvalid = false
                edtTglLahir.error = "Tgl.Lahir harus diisi"
            }
            if (username.isEmpty()) {
                isvalid = false
                edtUsername.error = "Username harus diisi"
            }
            if (password.isEmpty()) {
                isvalid = false
                edtPassword.error = "Passoword harus diisi"
            }


        val btnDaftarRegister: Button = findViewById(R.id.btn_daftar_register)
        btnDaftarRegister.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
    }
}
