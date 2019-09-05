package com.myweb.ass06


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ass06.R
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_three.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        view.btnClickFragThree.setOnClickListener(){
            var fragment: Fragment? = null
            fragment = TwoFragment()
            replaceFragment(fragment)
        }
        return  view
        // Inflate the layout for this fragment
    }
    fun replaceFragment(someFragment: Fragment){
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout,someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}
