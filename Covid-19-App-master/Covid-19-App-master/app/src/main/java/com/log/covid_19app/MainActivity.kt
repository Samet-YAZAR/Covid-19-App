package com.log.covid_19app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.log.covid_19app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val adapter = RulesAdapter()
    private val information = Information()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun setLayout() {
        binding.buttonImage.setOnClickListener(this)
        binding.buttonSettings.setOnClickListener(this)
        setRecyclerView()
        checkSettings()
    }

    fun setRecyclerView() {
        binding.rulesRecyclerview.adapter = adapter
        binding.rulesRecyclerview.layoutManager = LinearLayoutManager(this)
        binding.rulesRecyclerview.setHasFixedSize(true)
    }

    fun checkSettings() {
        if (Settings.english) {
            binding.buttonImage.text = information.button_text_en
            binding.buttonSettings.text = information.settings_en
            binding.headerTitle.text = information.header_en
            adapter.updateList(information.rules_en)
        } else {
            binding.buttonImage.text = information.button_text_pl
            binding.buttonSettings.text = information.settings_pl
            binding.headerTitle.text = information.header_pl
            adapter.updateList(information.rules_pl)
        }

        if (Settings.regular_mode) {
            binding.buttonImage.visibility = View.VISIBLE
        } else {
            binding.buttonImage.visibility = View.GONE
        }

    }

    override fun onStart() {
        super.onStart()
        setLayout()

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_image -> {
                val intent = Intent(this, ImageActivity::class.java)
                startActivity(intent)
            }

            R.id.button_settings -> {
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
            }
        }
    }
}