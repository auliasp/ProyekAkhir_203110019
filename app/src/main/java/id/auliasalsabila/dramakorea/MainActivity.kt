package id.auliasalsabila.dramakorea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDrakor: RecyclerView
    private var list: ArrayList<Drakor> = arrayListOf()
    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvDrakor = findViewById(R.id.rv_drakor)
        rvDrakor.setHasFixedSize(true)

        list.addAll(DrakorData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDrakor.layoutManager = LinearLayoutManager(this)
        val listDrakorAdapter = ListDrakorAdapter(list)
        rvDrakor.adapter = listDrakorAdapter

        listDrakorAdapter.setOnItemClickCallback(object : ListDrakorAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Drakor) {
                showSelectedDrakor(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title)

    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    private fun showRecyclerGrid() {
        rvDrakor.layoutManager = GridLayoutManager(this, 2)
        val gridDrakorAdapter = GridDrakorAdapter(list)
        rvDrakor.adapter = gridDrakorAdapter

    }
    private fun showRecyclerCardView() {
        rvDrakor.layoutManager = LinearLayoutManager(this)
        val cardViewDrakorAdapter = CardViewDrakorAdapter(list)
        rvDrakor.adapter = cardViewDrakorAdapter
    }
    private fun showSelectedDrakor(drakor: Drakor) {
        Toast.makeText(this, "Kamu memilih " + drakor.name, Toast.LENGTH_SHORT).show()
    }
}

