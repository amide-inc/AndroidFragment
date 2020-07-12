package xyz.devamin.androidfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root:View =  inflater.inflate(R.layout.fragemnt_main, container, false)
        val btn = root.findViewById<Button>(R.id.frag_btn)
        btn.setOnClickListener {
            Toast.makeText(activity?.applicationContext, "hello world", Toast.LENGTH_LONG).show()
        }
        return root
    }
}