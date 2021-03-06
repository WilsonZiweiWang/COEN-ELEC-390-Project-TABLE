package com.example.groupel.elecoen390_watermonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private boolean table_flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void CollapseTable(View view){
        TableLayout tableLayout = (TableLayout) findViewById(R.id.tablelayout);
        Button showDetails = (Button) findViewById(R.id.showDetails);
        //boolean: isCollapsed. False = expand; True = Collapse
        tableLayout.setColumnCollapsed(0,table_flag);
        tableLayout.setColumnCollapsed(2,table_flag);

        if(table_flag){
            //Close
            table_flag = false;
            showDetails.setText("SHOW DETAILS");
        }
        else{
            //Open
            table_flag = true;
            showDetails.setText("HIDE DETAILS");
        }
    }
}
