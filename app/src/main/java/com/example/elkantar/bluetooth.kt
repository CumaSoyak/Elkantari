package com.example.elkantar

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bluetooth.*

class bluetooth : AppCompatActivity() {

    val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()
    val  REQUEST_ENABLE_BT=0
    val  REQUEST_DISCOVER_BT=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluetooth)
        val intent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
        startActivityForResult(intent, REQUEST_ENABLE_BT)

        one.setOnClickListener {
            a()
        }
    }

    fun a(){
        if (bluetoothAdapter == null) {
             if (bluetoothAdapter?.isDiscovering == false) {
                val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE)
                startActivityForResult(enableBtIntent, REQUEST_DISCOVER_BT)
            }
        }
    }
}