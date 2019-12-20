package id.kuliah.simklik

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ActionMenuView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.text.FieldPosition

class CariActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cari)

    }

        @SuppressLint("ResourceType")
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            val inflater = menuInflater
            inflater.inflate(R.layout.activity_cari, menu)

            val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
            val searchItem = menu?.findItem(R.id.edt_search)
            val searchView = searchItem?.actionView as SearchView

            searchView.setSearchableInfo(manager.getSearchableInfo(componentName))

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    searchView.clearFocus()
                    searchView.setQuery("", false)
                    searchItem.collapseActionView()
                    Toast.makeText(this@CariActivity, "Looking for $query", Toast.LENGTH_LONG)
                        .show()
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    return false
                }
            })
            return true
        }
}

