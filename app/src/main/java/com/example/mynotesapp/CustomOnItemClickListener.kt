package com.example.mynotesapp

import android.view.View

class CustomOnItemClickListener(private val position: Int, private val  onItemClickCallback: OnItemClickCallback) : View.OnClickListener {

   //Kelas ini bertugas membuat item seperti CardView bisa diklik di dalam adapter
    override fun onClick(view: View) {
        onItemClickCallback.onItemClicked(view, position)
    }

    interface OnItemClickCallback {
        fun onItemClicked(view: View, position: Int)
    }
}