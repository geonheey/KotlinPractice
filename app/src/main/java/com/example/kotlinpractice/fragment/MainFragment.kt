package com.example.kotlinpractice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlinpractice.R
import com.example.kotlinpractice.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var navController: NavController
    lateinit var binding : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_main, container, false)
        //바인딩 초기화
        binding = FragmentMainBinding.inflate(inflater, container,false)
        // 원래 레이아웃뷰 반환은 이거지만 바인딩 사용하므로 바꿔줌
        //return inflater.inflate(R.layout.fragment_main, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //navController = Navigation.findNavController(view)
        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        navController = navHostFragment.navController

        //id 이름은 _없고 카멜표기법으로 지정
        binding.btnNext.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }

}


