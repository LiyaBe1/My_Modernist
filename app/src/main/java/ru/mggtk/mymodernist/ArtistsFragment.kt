package ru.mggtk.mymodernist

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ArtistsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ArtistsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_artists,container, false)
        val imageButton = view.findViewById<ImageButton>(R.id.imageButton1)
        imageButton.setOnClickListener{
            val intent = Intent(activity, Leo::class.java)
            startActivity(intent)
        }


        val imageButton3 = view.findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener{
            val intent = Intent(activity, Climt::class.java)
            startActivity(intent)
        }

        val imageButton4 = view.findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener{
            val intent = Intent(activity, Kupka::class.java)
            startActivity(intent)
        }

        val imageButton5 = view.findViewById<ImageButton>(R.id.imageButton5)
        imageButton5.setOnClickListener{
            val intent = Intent(activity, Dali::class.java)
            startActivity(intent)
        }

        val imageButton7 = view.findViewById<ImageButton>(R.id.imageButton7)
        imageButton7.setOnClickListener{
            val intent = Intent(activity, Pablo::class.java)
            startActivity(intent)
        }
        val imageButton8 = view.findViewById<ImageButton>(R.id.imageButton8)
        imageButton8.setOnClickListener{
            val intent = Intent(activity, Amilio::class.java)
            startActivity(intent)
        }
        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ArtistsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ArtistsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}