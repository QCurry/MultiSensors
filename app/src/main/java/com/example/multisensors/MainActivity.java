package com.example.multisensors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (null == savedInstanceState)
		{
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.container, MultiSensorsFragment.newInstance())
					.commit();
		}
	}
}
