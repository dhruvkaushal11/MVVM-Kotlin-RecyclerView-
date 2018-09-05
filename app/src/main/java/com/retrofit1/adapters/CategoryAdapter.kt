package com.retrofit1.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.retrofit1.Datum
import com.retrofit1.News
import com.retrofit1.databinding.AppItemBinding
import java.util.ArrayList

class CategoryAdapter(private var listener: OnCategoryClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val mCategoryList = ArrayList<News>()

    fun setAppList(categoryModel: ArrayList<News>) {
        mCategoryList.addAll(categoryModel)
        //notifyItemRangeInserted(0, categoryModel.size)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        Log.d("LIST_SIZE","" + mCategoryList.size)
        return mCategoryList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val appInfo = mCategoryList[position]
        (holder as CategoryAdapter.RecyclerHolderCatIcon).bind(appInfo, listener)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val applicationBinding = AppItemBinding.inflate(layoutInflater, parent, false)
        return RecyclerHolderCatIcon(applicationBinding)
    }

    interface OnCategoryClickListener {
        fun onCategoryClick(position: Int)
    }


    inner class RecyclerHolderCatIcon(private var applicationBinding: AppItemBinding) : RecyclerView.ViewHolder(applicationBinding.root) {

        fun bind(appInfo: News, listener: OnCategoryClickListener?) {
            applicationBinding.appModelNews  = appInfo

        }


    }
}