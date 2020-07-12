package xyz.devamin.androidfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val main_btn = findViewById<Button>(R.id.main_btn)
        var counter = 0
        main_btn.setOnClickListener {
            if(counter == 0) {
                val fragManager = supportFragmentManager
                val fragTrans = fragManager.beginTransaction()

                val myFrag = MyFragment()
                fragTrans.add(R.id.my_fragment, myFrag)
                fragTrans.commit()

            }else if(counter%2 == 0) {
                val fragManager = supportFragmentManager
                val fragTrans = fragManager.beginTransaction()

                val myFrag = MyFragment()
                fragTrans.replace(R.id.my_fragment, myFrag)

                fragTrans.commit()
            }else {
                val fragManager = supportFragmentManager
                val fragTrans = fragManager.beginTransaction()
                val nextFrag = NextFragement()
                fragTrans.replace(R.id.my_fragment, nextFrag)

                fragTrans.commit()
            }
            counter ++
        }
    }
}
