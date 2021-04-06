package com.log.covid_19app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RulesAdapter() : RecyclerView.Adapter<RulesAdapter.ViewHolder>() {

    var list: ArrayList<String> = arrayListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.container_rules, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.rule.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(newList: ArrayList<String>) {
        list = newList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val rule = itemView.findViewById<TextView>(R.id.rule_text)
    }


}