package com.example.mysimplescheduler.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mysimplescheduler.databinding.FragmentAddBinding
import org.w3c.dom.Text

class AddFragment : Fragment() {
    //variables
    private lateinit var taskStartDate : EditText
    private lateinit var taskEndDate : EditText
    private lateinit var taskHeader : EditText
    private lateinit var taskDesc : EditText
    private lateinit var addTask : Button

    private var _binding: FragmentAddBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val addViewModel =
            ViewModelProvider(this).get(AddViewModel::class.java)

        _binding = FragmentAddBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAdd
        addViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}