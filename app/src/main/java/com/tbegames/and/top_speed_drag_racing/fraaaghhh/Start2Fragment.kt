package com.tbegames.and.top_speed_drag_racing.fraaaghhh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tbegames.and.top_speed_drag_racing.R
import com.tbegames.and.top_speed_drag_racing.databinding.FragmentStart2Binding


class Start2Fragment : Fragment() {

    private fun gtnjknhynhynjyh() {
        Snackbar.make(
            ssskkaa.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var frjrfrffrhfrhhrf: FragmentStart2Binding? = null
    private val ssskkaa get() = frjrfrffrhfrhhrf ?: throw RuntimeException("FragmentStart2Binding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frjrfrffrhfrhhrf = FragmentStart2Binding.inflate(inflater, container, false)
        return ssskkaa.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            frouihurfrfrfgfr()

        } catch (e: Exception) {
            gtnjknhynhynjyh()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun frouihurfrfrfgfr() {
        ssskkaa.btnPlayGameeee.setOnClickListener {
            guthtguhugt()
        }
    }

    private fun guthtguhugt() {
        findNavController().navigate(R.id.action_start2Fragment_to_stert3Fragment)
    }

    override fun onDestroy() {
        frjrfrffrhfrhhrf = null
        super.onDestroy()
    }

}