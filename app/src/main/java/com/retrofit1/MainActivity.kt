package com.retrofit1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.retrofit1.adapters.CategoryAdapter
import com.retrofit1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity(), CategoryAdapter.OnCategoryClickListener {
    override fun onCategoryClick(position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    private lateinit var appStoreHomeViewModel: MainViewModel
    lateinit var binding: ActivityMainBinding
    var dataList: ArrayList<News> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        appStoreHomeViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.mainModelHome = appStoreHomeViewModel

        setRecyclerView(dataList)   //send empty list initially

        subscribeDataCallBack()


    }


    private fun subscribeDataCallBack() {

        appStoreHomeViewModel.getProjectList()?.observe(this, Observer<ArrayList<News>> {

            if (it != null) {
                categoryAdapter.setAppList(it)
            }

        })

    }

    private lateinit var categoryAdapter: CategoryAdapter

    private fun setRecyclerView(dataList: ArrayList<News>) {
        categoryAdapter = CategoryAdapter(this)
        val categoryLinearLayoutManager = LinearLayoutManager(this)
        categoryLinearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.root.recycler_news.layoutManager = categoryLinearLayoutManager
        categoryAdapter.setAppList(dataList)
        binding.root.recycler_news.adapter = categoryAdapter


    }
}
