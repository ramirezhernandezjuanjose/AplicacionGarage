package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





   public boolean onCreateOptionsMenu(Menu menu)
   {
        getMenuInflater().inflate(R.menu.menu_garage,menu);
        return true;
   }



   public  boolean onOptionsItemSelected(MenuItem item)
   {
      int id = item.getItemId();
       if (id== R.id.item_1)
       {
           Intent i = new Intent(this, mision.class);
           startActivity(i);
           finish();

         }else if(id== R.id.item_2)
         {
             Intent i = new Intent(this, quienes_somos.class);
             startActivity(i);
             finish();

         }else if (id== R.id.item_3)
         {
             Intent i = new Intent(this, mision.class);
             startActivity(i);
             finish();

         }else if (id == R.id.item_4)
         {
             Intent i = new Intent(this, vision.class);
             startActivity(i);
             finish();

         } else if (id == R.id.logo)
    {
        Intent i = new Intent(this, compartir.class);
        startActivity(i);
        finish();

    }
        return super.onOptionsItemSelected(item);

   }



}
