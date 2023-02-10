package com.tbegames.and.top_speed_drag_racing.fraaaghhh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tbegames.and.top_speed_drag_racing.R
import com.tbegames.and.top_speed_drag_racing.databinding.FragmentStart4Binding


class Start4Fragment : Fragment() {

    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentStart4Binding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentStart4Binding: FragmentStart4Binding? = null
    private val binding
        get() = fragmentStart4Binding ?: throw RuntimeException("FragmentStart4Binding = null")


    private val jgtijogtoihyioi by lazy {
        listOf(
            binding.imgGameElem1,
            binding.imgGameElem2,
            binding.imgGameElem3,
            binding.imgGameElem4,
            binding.imgGameElem5,
            binding.imgGameElem6,
            binding.imgGameElem7,
            binding.imgGameElem8,
        )
    }

    private fun hyjhyjojhyjihy() {
        jgtijogtoihyioi.forEach {
            if (it.visibility == View.VISIBLE) return
        }
        togthgthhgt()
    }

    private fun togthgthhgt() {
        findNavController().navigate(R.id.action_start4Fragment_to_staaarttt1Fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStart4Binding = FragmentStart4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtigtoihigtji()

            binding.imgGameElem2.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                hyjhyjojhyjihy()
            }

            binding.imgGameElem3.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                hyjhyjojhyjihy()
            }

            binding.imgGameElem4.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                hyjhyjojhyjihy()
            }

            tgiojgtgtjgtigtj()

            ugtgthgtigthigthgt()

            ijojgtijgtjgtjigt()



        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun ugtgthgtigthigthgt() {
        binding.imgGameElem6.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem7.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun ijojgtijgtjgtjigt() {
        binding.imgGameElem8.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun tgiojgtgtjgtigtj() {
        binding.imgGameElem5.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun gtigtoihigtji() {
        binding.imgGameElem1.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }


}