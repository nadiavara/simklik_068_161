package id.kuliah.simklik

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Instance ke FirebaseAuth
        mAuth = FirebaseAuth.getInstance()

        //Instance ke Firestore
        db = FirebaseFirestore.getInstance()

        //Component
        val edtUsername: EditText = findViewById(R.id.edt_user_login)
        val edtPassword: EditText = findViewById(R.id.edt_password_login)

        //Tombol login
        val btnLogin = findViewById<Button>(R.id.btn_login_login)
        btnLogin.setOnClickListener {

            // Ambil data dari form
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()

            var isvalid = true

            // Validasi form
            if (username.isEmpty()) {
                isvalid = false
                edtUsername.error = "Username harus diisi"
            }

            if (password.isEmpty()) {
                isvalid =

                    false
                edtPassword.error = "Passoword harus diisi"
            }

        val btnRegister: Button = findViewById(R.id.btn_masuk_register)
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
            val btnLogin: Button = findViewById(R.id.btn_login_login)
            btnLogin.setOnClickListener {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
