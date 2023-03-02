package com.example.custoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.custoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_calculate){
            calculate()
        }
    }

    private fun calculate(){
        // Toast

        Toast.makeText(this, "Clicado!", Toast.LENGTH_LONG).show()
    }

}