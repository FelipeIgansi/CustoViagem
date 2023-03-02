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
        if (view.id == R.id.btn_calculate) {
            calculate()
        }
    }
    private fun isValid():Boolean{
        return (binding.editTxtDistance.text.toString() != "" &&
                binding.editTxtPrice.text.toString() != "" &&
                binding.editTxtAutonomy.text.toString() != "")
    }

    private fun calculate() {

        if (isValid()) {
            val distance = binding.editTxtDistance.text.toString().toFloat()
            val price = binding.editTxtPrice.text.toString().toFloat()
            val autonomy = binding.editTxtAutonomy.text.toString().toFloat()

            val totalValue = ((distance * price) / autonomy)
            val totalValueStr = "R$ ${"%.2f".format(totalValue)}".replace(".", ",")
            // Toast

            binding.txtValue.text = totalValueStr
        }else
            Toast.makeText(this, R.string.incorect_values, Toast.LENGTH_SHORT).show()
    }

}