package com.android.example.myapplication.vital.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.android.example.myapplication.data.Vital
import com.android.example.myapplication.databinding.VitalItemBinding
import com.android.example.myapplication.vital.VitalListFragmentDirections
import com.android.example.myapplication.vital.VitalListViewModel

class VitalListAdapter(private val viewModel: VitalListViewModel) :
    RecyclerView.Adapter<VitalListAdapter.ViewHolder>() {

    private var vitalList = ArrayList<Vital>()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)

        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: VitalItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Vital) {

            binding.vital = item
            binding.root.setOnClickListener {
                val action =
                    VitalListFragmentDirections.actionVitalListFragmentDestToVitalDetailsFragment(
                        item,
                        item.type
                    )

                it.findNavController().navigate(action)
            }
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = VitalItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    fun getItem(position: Int) = vitalList[position]

    override fun getItemCount(): Int {
        return vitalList.size
    }

    fun submitList(items: List<Vital>) {
        vitalList.clear()
        vitalList.addAll(items)
        notifyDataSetChanged()
    }
}

