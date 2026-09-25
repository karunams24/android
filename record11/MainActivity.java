package com.example.gridview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView g1;
    int[] images= {R.drawable.apple,
            R.drawable.banana,
            R.drawable.citrus,
            R.drawable.dragonfruit,
    };

    String[] names= {
            "Apple",
            "Banana",
            "Orange",
            "Dragon Fruit"

    };
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
      g1=findViewById(R.id.gridView);

       g1.setAdapter(new BaseAdapter() {
            @Override
            public int getCount(){
                return images.length;
            }
            @Override
            public Object getItem(int position){
                return null;
            }
            @Override
            public long getItemId(int position){
                return position;
            }
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                ImageView imageView=new ImageView(MainActivity.this);
                imageView.setImageResource(images[position]);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            }
        });
       g1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               new AlertDialog.Builder(MainActivity.this)
                       .setTitle("Selected Image")
                       .setMessage("You Selected"+names[position])
                       .setPositiveButton("OK",null)
                       .show();
           }
       });
    }
}
