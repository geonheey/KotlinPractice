package com.example.kotlinpractice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlinpractice.R

class QuestionFragment : Fragment(), View.OnClickListener {

    lateinit var navController : NavController
    private var botton : ImageView?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val button = view.findViewById<ImageView>(R.id.btn_next2)
        button.setOnClickListener(this)

    }


    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.btn_next2 -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }

}


