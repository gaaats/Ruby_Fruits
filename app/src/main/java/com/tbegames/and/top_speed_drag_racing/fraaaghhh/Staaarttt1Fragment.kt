package com.tbegames.and.top_speed_drag_racing.fraaaghhh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tbegames.and.top_speed_drag_racing.R
import com.tbegames.and.top_speed_drag_racing.databinding.FragmentStaaarttt1Binding


class Staaarttt1Fragment : Fragment() {


    private fun forrfjfrjrfjrfjrf() {
        binding.leeeftDovn.setOnClickListener {
            findNavController().navigate(R.id.action_staaarttt1Fragment_to_start2Fragment)
        }
        binding.leeeftTop.setOnClickListener {
            iuhrfihfrhurfhrfufrh()
        }
    }

    private fun gtuhiugtgthgt() {
        binding.rightTop.setOnClickListener {
            iuhrfihfrhurfhrfufrh()
        }
        binding.rightDovnp.setOnClickListener {
            iuhrfihfrhurfhrfufrh()
        }
    }

    private fun rfhihfrhhrfurf() {
        binding.leaderrrs.setOnClickListener {
            iuhrfihfrhurfhrfufrh()
        }
    }

    private fun iuhrfihfrhurfhrfufrh() {
        Toast.makeText(requireContext(), "Try again", Toast.LENGTH_SHORT).show()
    }


    override fun onDestroy() {
        gtgtgtihgtihgt = null
        super.onDestroy()
    }


    private fun eeeeeeee() {
        Snackbar.make(
            binding.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgtgtihgtihgt = FragmentStaaarttt1Binding.inflate(inflater, container, false)
        return binding.root
    }

    private var gtgtgtihgtihgt: FragmentStaaarttt1Binding? = null
    private val binding
        get() = gtgtgtihgtihgt ?: throw RuntimeException("FragmentStaaarttt1Binding = null")



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            forrfjfrjrfjrfjrf()
            gtuhiugtgthgt()

            rfhihfrhhrfurf()




        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }
}