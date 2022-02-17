package com.afs.fragmentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.afs.fragmentodev.databinding.FragmentBBinding
import com.afs.fragmentodev.databinding.FragmentXBinding


class XFragment : Fragment() {
private lateinit var tasarim:FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentXBinding.inflate(inflater, container, false)

        tasarim.buttonSon.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sayfaGecisXtoY)
        }

        return tasarim.root
    }



}