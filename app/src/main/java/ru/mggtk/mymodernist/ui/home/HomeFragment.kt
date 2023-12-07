package ru.mggtk.mymodernist.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView


import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.mggtk.mymodernist.Amilio
import ru.mggtk.mymodernist.ArtistsFragment
import ru.mggtk.mymodernist.Climt
import ru.mggtk.mymodernist.Dali
import ru.mggtk.mymodernist.DaliFradeActivity
import ru.mggtk.mymodernist.KandinskyActivity
import ru.mggtk.mymodernist.Kupka
import ru.mggtk.mymodernist.Leo
import ru.mggtk.mymodernist.ModernismActivity
import ru.mggtk.mymodernist.Pablo
import ru.mggtk.mymodernist.R
import ru.mggtk.mymodernist.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        val view = inflater.inflate(R.layout.fragment_home,container, false)
        val imageButton = view.findViewById<ImageButton>(R.id.imageButton)
        imageButton.setOnClickListener{
            val intent = Intent(activity, ModernismActivity::class.java)
            startActivity(intent)
        }


        val imageButton2 = view.findViewById<ImageButton>(R.id.imageButton2)
        imageButton2.setOnClickListener{
            val intent = Intent(activity, KandinskyActivity::class.java)
            startActivity(intent)
        }

        val imageButton5 = view.findViewById<ImageButton>(R.id.imageButton5)
        imageButton5.setOnClickListener{
            val intent = Intent(activity, DaliFradeActivity::class.java)
            startActivity(intent)
        }

        val imageButton6 = view.findViewById<ImageButton>(R.id.imageButton6)
        imageButton6.setOnClickListener{
            val intent = Intent(activity, Leo::class.java)
            startActivity(intent)
        }

        val imageButton9 = view.findViewById<ImageButton>(R.id.imageButton9)
        imageButton9.setOnClickListener{
            val intent = Intent(activity, Kupka::class.java)
            startActivity(intent)
        }
        val imageButton10 = view.findViewById<ImageButton>(R.id.imageButton10)
        imageButton10.setOnClickListener{
            val intent = Intent(activity, Dali::class.java)
            startActivity(intent)
        }



        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return view
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}