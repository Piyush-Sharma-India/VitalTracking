package com.android.example.myapplication.vital

import android.content.Context
import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.android.example.myapplication.VitalTrackingApplication
import com.android.example.myapplication.vital.adapter.VitalListAdapter
import com.android.example.myapplication.databinding.VitalListFragmentBinding
import javax.inject.Inject

class VitalListFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val vitalListViewModel by viewModels<VitalListViewModel> { viewModelFactory }

    private lateinit var viewDataBinding: VitalListFragmentBinding

    private lateinit var listAdapter: VitalListAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (requireActivity().application as VitalTrackingApplication).appComponent.vitalComponent()
            .create()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = VitalListFragmentBinding.inflate(inflater, container, false).apply {
            viewModel = vitalListViewModel
        }

        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // Set the lifecycle owner to the lifecycle of the view
        viewDataBinding.lifecycleOwner = this.viewLifecycleOwner

        setupListAdapter()
    }

    private fun navigateToCart() {
//        val action = AlbumSearchFragmentDirections.actionAlbumSearchFragmentDestToCartFragment()
//        findNavController().navigate(action)
    }

    private fun setupListAdapter() {
        val viewModel = viewDataBinding.viewModel
        if (viewModel != null) {
            listAdapter = VitalListAdapter(viewModel)
            viewDataBinding.vitalList.adapter = listAdapter
        }
    }
}