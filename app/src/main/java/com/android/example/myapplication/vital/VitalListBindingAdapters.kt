package com.android.example.myapplication.vital

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.android.example.myapplication.vital.adapter.VitalListAdapter
import com.android.example.myapplication.data.Vital

@BindingAdapter("items")
fun setItems(listView: RecyclerView, items: List<Vital>) {
    (listView.adapter as? VitalListAdapter)?.submitList(items)
}