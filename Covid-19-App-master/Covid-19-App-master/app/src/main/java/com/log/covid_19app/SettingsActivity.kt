package com.log.covid_19app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import com.log.covid_19app.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        setLayout()
        checkSettings()

    }

    fun setLayout(){
        binding.modeSwitch.setOnCheckedChangeListener(this)
        binding.languageSwitch.setOnCheckedChangeListener(this)
    }

    fun checkSettings(){
        binding.modeSwitch.isChecked = Settings.regular_mode
        binding.languageSwitch.isChecked = Settings.english


        if(Settings.english){
            binding.languageText.text = "English"
            binding.modeText.text = "Pro Mode"
        } else {
            binding.languageText.text = "Polskie"
            binding.modeText.text = "Tryb Pro"
        }

    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView?.id){
            R.id.mode_switch -> {
                Settings.modeSwitch(isChecked)
            }
            R.id.language_switch -> {
                Settings.languageSwitch(isChecked)
                checkSettings()
            }
        }
    }

}