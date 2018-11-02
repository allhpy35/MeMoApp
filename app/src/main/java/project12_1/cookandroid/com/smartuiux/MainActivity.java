package project12_1.cookandroid.com.smartuiux;

import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected Button OpenBtn, CloseBtn;
    protected CheckBox checkboxLock;
    protected TextView contentTextview;
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        final String[] items = {"WHITE", "RED", "GREEN", "BLUE", "BLACK"} ;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items) ;

        listview = (ListView) findViewById(R.id.drawer_menulist);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                 contentTextview = (TextView) findViewById(R.id.drawer_content) ;

                switch (position) {
                    case 0: // WHITE
                        contentTextview.setBackgroundColor(Color.rgb(0xFF, 0xFF, 0xFF));
                        contentTextview.setTextColor(Color.rgb(0x00, 0x00, 0x00));
                        contentTextview.setText("WHITE");
                        break;
                    case 1: // RED
                        contentTextview.setBackgroundColor(Color.rgb(0xFF, 0x00, 0x00));
                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF));
                        contentTextview.setText("RED");
                        break;
                    case 2: // GREEN
                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0xFF, 0x00));
                        contentTextview.setTextColor(Color.rgb(0x00, 0x00, 0x00));
                        contentTextview.setText("GREEN");
                        break;
                    case 3: // BLUE
                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0x00, 0xFF));
                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF));
                        contentTextview.setText("BLUE");
                        break;
                    case 4: // BLACK
                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0x00, 0x00));
                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF));
                        contentTextview.setText("BLACK");
                        break;

                }


                listview.setOnItemClickListener(new ListView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView parent, View v, int position, long id) {



                        // close drawer.
                        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer) ;
                        drawer.closeDrawer(Gravity.LEFT) ;
                    }
                });

            }
        });  */


    }
}



