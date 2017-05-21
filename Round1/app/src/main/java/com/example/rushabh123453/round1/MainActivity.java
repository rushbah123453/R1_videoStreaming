package com.example.rushabh123453.round1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String Titles[];
    String Desc[];
    ListView listView;
    int images[]=  {R.drawable.drw1,R.drawable.drw1,R.drawable.drw1,
                   R.drawable.drw1,R.drawable.drw1,R.drawable.drw1,
                    R.drawable.drw1,R.drawable.drw1,R.drawable.drw1,
                    R.drawable.drw1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res= getResources();
        Titles=res.getStringArray(R.array.titles);
        Desc=res.getStringArray(R.array.description);

        listView=(ListView)findViewById(R.id.listView);

        R1_Adapter adapter=new R1_Adapter(this,Titles,images,Desc);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent=new Intent(this,Video.class);
        switch (position)
        {
            case 0:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();

                startActivity(intent);

                break;
            case 1:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();

                startActivity(intent);
                break;
            case 2:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();

                startActivity(intent);
                break;
            case 3:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case 4:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case 5:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case 6:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case 7:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case 8:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case 9:
                Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            default:
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
        }


    }
}


class R1_Adapter extends ArrayAdapter<String>
{
    Context context;
    int images[];
    String title_array[];
    String desp_array[];
    R1_Adapter(Context c,String[] titles,int imgs[],String desp[])
    {


        super(c,R.layout.row,R.id.textView_title,titles);

        this.context=c;
        this.images=imgs;
        this.title_array=titles;
        this.desp_array=desp;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       View row= inflater.inflate(R.layout.row,parent,false);

        ImageView myimage=(ImageView)row.findViewById(R.id.imageView);
        TextView mytitle=(TextView)row.findViewById(R.id.textView_title);
        TextView mydescp=(TextView)row.findViewById(R.id.textView2_desp);


        myimage.setImageResource(images[position]);
        mytitle.setText(title_array[position]);
        mydescp.setText(desp_array[position]);
        return row;



    }
}


