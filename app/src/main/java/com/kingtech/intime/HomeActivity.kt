package com.kingtech.intime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kingtech.intime.adapter.TaskAdapter
import com.kingtech.intime.data.TaskDatabase
import com.kingtech.intime.databinding.ActivityHomeBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private var mDb: TaskDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mDb = TaskDatabase.getInstance(this)
        binding.rvTask.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        fetchData()
    }

    override fun onResume() {
        super.onResume()
        fetchData()
    }

    fun fetchData() {
        GlobalScope.launch {
            val listTask = mDb?.taskDao()?.getAllTask()

            runOnUiThread{
                listTask?.let {
                    val adapter = TaskAdapter(it)
                    binding.rvTask.adapter = adapter
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        TaskDatabase.destroyInstance()
    }
}