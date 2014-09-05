package com.prog101.citation_iasb;

import java.util.Random;

import com.prog101.citation_iasb.R.array;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	public TextView mBouche;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mBouche = (TextView)findViewById(R.id.bouche);
	}
	Random rand = new Random();
	int dernierNbObtenuJack = -1;
	int dernierNbObtenuYoda = -1;
	int dernierNbObtenuVader = -1;
	
	private String [] cit;
	
	void citerJack(View vue){
		int index = nbreAleatoire();
		Resources res = getResources();
		cit = res.getStringArray(R.array.citationsJack);
		while(index == dernierNbObtenuJack)
		{
			index = nbreAleatoire();
		}
		dernierNbObtenuJack = index;
		mBouche.setText(cit[index]);
		
	}
	void citerYoda(View vue){
		
	}
	void citerVader(View vue){
	
	}
	int nbreAleatoire(){
		int nbre;
		nbre = rand.nextInt(5);
		return nbre;
	}
}
