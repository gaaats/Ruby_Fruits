package com.tbegames.and.top_speed_drag_racing.veeb

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tbegames.and.top_speed_drag_racing.R
import com.tbegames.and.top_speed_drag_racing.toooo.Bhfbrrfrf
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FiiiiirstttttFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiiirsttttt, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyjoijhyjhyji = context
    }

    private lateinit var hyhyjoijhyjhyji: Context
    lateinit var gtgtgtgtgtgt: String

    val gtgthyhyhyyhhyhyhy by activityViewModel<Bhfbrrfrf>(named("MainModel"))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtgthyhyhyyhhyhyhy.ggtjigtiuhgt(hyhyjoijhyjhyji)

        gigtjojgtjgtjgtjgt()

    }

    private fun gigtjojgtjgtjgtjgt() {
        gttggtuhugthgthgt()
    }

    private fun gttggtuhugthgthgt() {
        ogigtojgtjgtjgtji()
    }

    private fun ogigtojgtjgtjgtji() {
        findNavController().navigate(R.id.action_fiiiiirstttttFragment_to_coCOCOFragment)
    }
}