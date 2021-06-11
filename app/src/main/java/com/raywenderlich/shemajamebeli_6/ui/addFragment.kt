package com.raywenderlich.shemajamebeli_6.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.raywenderlich.shemajamebeli_6.R
import com.raywenderlich.shemajamebeli_6.databinding.AddFragmentBinding
import com.raywenderlich.shemajamebeli_6.storage.DataForRoom

class addFragment : Fragment() {


    private lateinit var binding: AddFragmentBinding

    private val viewModel: AddViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = AddFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkFields()

    }

    private fun checkFields(){
        binding.apply {
            button2.setOnClickListener {
                if (editTextTitle.text.length >= 6 && editTextDescription.text.length >= 32){

                        viewModel.put(DataForRoom(title = editTextTitle.text.toString(),
                        description = editTextDescription.text.toString(),
                        img = editTextTextPersonName3.text.toString()))

                }else{
                    Toast.makeText(context,"shevase simboloebi sworad",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }



}