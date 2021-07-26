package com.example.bluetoothfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView searchTextView;
    ListView listView;
    Button searchButton;
    BluetoothAdapter bluetoothAdapter;


    public void searchClicked(View view) {
        searchTextView.setText("Searching...");
        searchButton.setEnabled(false);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchTextView = findViewById(R.id.searchTextView);
        listView = findViewById(R.id.listView);
        searchButton = findViewById(R.id.searchButton);

        


    }


}