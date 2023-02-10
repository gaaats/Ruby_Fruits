package com.tbegames.and.top_speed_drag_racing.fraaaghhh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.tbegames.and.top_speed_drag_racing.R
import com.tbegames.and.top_speed_drag_racing.databinding.FragmentStert3Binding
import com.tbegames.and.top_speed_drag_racing.gaaame.IJjfjjgtigtjgt
import com.tbegames.and.top_speed_drag_racing.gaaame.Jjgtjgtjgt


class Stert3Fragment : Fragment(), IJjfjjgtigtjgt {

    override fun onDestroy() {
        fragmentStert3Binding = null
        super.onDestroy()
    }

    override fun clclcllcgimi(score: Int) {
        val jujuujuj = "Score : $score"
        startyBinding.root.removeView(gameViev)
        startyBinding.tvScoreGame1.text = jujuujuj
        startyBinding.btnStart.visibility = View.VISIBLE
        gtjgtjigtjigt()
        gameViev = null

        jigiuhgtgt()
    }

    private fun gtjgtjigtjigt() {
        startyBinding.tvScoreGame1.visibility = View.VISIBLE
        startyBinding.imgLogoGame1.visibility = View.VISIBLE
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStert3Binding = FragmentStert3Binding.inflate(inflater, container, false)
        return startyBinding.root
    }

    val hjhiyjjhyijhy = listOf(
        R.drawable.e5,
    )

    private var fragmentStert3Binding: FragmentStert3Binding? = null
    private val startyBinding get() = fragmentStert3Binding ?: throw RuntimeException("FragmentStert3Binding = null")

    private var gameViev: Jjgtjgtjgt? = null

    private fun jigiuhgtgt() {
        findNavController().navigate(R.id.action_stert3Fragment_to_start4Fragment)
    }

    private fun eepepepep() {
        Toast.makeText(
            requireContext(),
            "Oops error, please try again...",
            Toast.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        try {
            gtgtjgtjijtgijigtjijgt()
        } catch (e: Exception) {
            eepepepep()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtgtjgtjijtgijigtjijgt() {
        startyBinding.btnStart.setOnClickListener {
            gameViev =
                Jjgtjgtjgt(requireContext(), this, R.drawable.pers, hjhiyjjhyijhy)
            gameViev!!.setBackgroundResource(R.drawable.gaaammmy)
            gameViev!!.background.alpha = 230
            startyBinding.root.addView(gameViev)
            startyBinding.btnStart.visibility = View.GONE
            gtkktgtk()
        }
    }

    private fun gtkktgtk() {
        startyBinding.tvScoreGame1.visibility = View.GONE
        startyBinding.imgLogoGame1.visibility = View.GONE
    }

}