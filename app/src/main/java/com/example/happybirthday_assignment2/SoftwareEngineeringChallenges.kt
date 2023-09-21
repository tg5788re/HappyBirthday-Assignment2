package com.example.happybirthday_assignment2


import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class SoftwareEngineeringChallenges : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_software_engineering_challenges)

        val listView = findViewById<ListView>(R.id.listView)
        val itemList = ArrayList<String>()
        itemList.add("Device Fragmentation")
        itemList.add("OS Fragmentation")
        itemList.add("Unstable and Dynamic Environment")
        itemList.add("Rapid Changes")
        itemList.add("Tool Support")
        itemList.add("Low Tolerance By Users")
        itemList.add("Low Security and Privacy Awareness")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, itemList)
        listView.adapter = adapter

        val mainButton = findViewById<Button>(R.id.MainButton)
        mainButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}