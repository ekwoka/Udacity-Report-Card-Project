package net.thekwoka.remportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Reportcard> reportList = new ArrayList<Reportcard>();

        reportList.add(new Reportcard("Eric Kwoka", 3.2,1.7,5.0));
        reportList.add(new Reportcard("Chungmin Lee", 3.5,5.0, 3.7));
        reportList.add(new Reportcard("Bob Zygot", 1.5,1.7,1.2));
        reportList.add(new Reportcard("Nayeon", 1.0,4.9, 2.3));
        reportList.add(new Reportcard("Momo", 0.5,6.0,3.2));
        reportList.add(new Reportcard("Name Here", 1.6,4.8, 3.7));
        reportList.add(new Reportcard("I suck", 5.0,1.7,2.7));
        reportList.add(new Reportcard("at making", 2.8,3.0, 3.5));
        reportList.add(new Reportcard("Fake Names", 4.2,3.8,2.6));
        reportList.add(new Reportcard("Eric Kwoka", 3.2,1.7,5.0));
        reportList.add(new Reportcard("Chungmin Lee", 3.5,5.0, 3.7));
        reportList.add(new Reportcard("Bob Zygot", 1.5,1.7,1.2));
        reportList.add(new Reportcard("Nayeon", 1.0,4.9, 2.3));
        reportList.add(new Reportcard("Momo", 0.5,6.0,3.2));
        reportList.add(new Reportcard("Name Here", 1.6,4.8, 3.7));
        reportList.add(new Reportcard("I suck", 5.0,1.7,2.7));
        reportList.add(new Reportcard("at making", 2.8,3.0, 3.5));
        reportList.add(new Reportcard("Fake Names", 4.2,3.8,2.6));
        reportList.add(new Reportcard("Eric Kwoka", 3.2,1.7,5.0));
        reportList.add(new Reportcard("Chungmin Lee", 3.5,5.0, 3.7));
        reportList.add(new Reportcard("Bob Zygot", 1.5,1.7,1.2));
        reportList.add(new Reportcard("Nayeon", 1.0,4.9, 2.3));
        reportList.add(new Reportcard("Momo", 0.5,6.0,3.2));
        reportList.add(new Reportcard("Name Here", 1.6,4.8, 3.7));
        reportList.add(new Reportcard("I suck", 5.0,1.7,2.7));
        reportList.add(new Reportcard("at making", 2.8,3.0, 3.5));
        reportList.add(new Reportcard("Fake Names", 4.2,3.8,2.6));
        reportList.add(new Reportcard("Eric Kwoka", 3.2,1.7,5.0));
        reportList.add(new Reportcard("Chungmin Lee", 3.5,5.0, 3.7));
        reportList.add(new Reportcard("Bob Zygot", 1.5,1.7,1.2));
        reportList.add(new Reportcard("Nayeon", 1.0,4.9, 2.3));
        reportList.add(new Reportcard("Momo", 0.5,6.0,3.2));
        reportList.add(new Reportcard("Name Here", 1.6,4.8, 3.7));
        reportList.add(new Reportcard("I suck", 5.0,1.7,2.7));
        reportList.add(new Reportcard("at making", 2.8,3.0, 3.5));
        reportList.add(new Reportcard("Fake Names", 4.2,3.8,2.6));
        reportList.add(new Reportcard("Eric Kwoka", 3.2,1.7,5.0));
        reportList.add(new Reportcard("Chungmin Lee", 3.5,5.0, 3.7));
        reportList.add(new Reportcard("Bob Zygot", 1.5,1.7,1.2));
        reportList.add(new Reportcard("Nayeon", 1.0,4.9, 2.3));
        reportList.add(new Reportcard("Momo", 0.5,6.0,3.2));
        reportList.add(new Reportcard("Name Here", 1.6,4.8, 3.7));
        reportList.add(new Reportcard("I suck", 5.0,1.7,2.7));
        reportList.add(new Reportcard("at making", 2.8,3.0, 3.5));
        reportList.add(new Reportcard("Fake Names", 4.2,3.8,2.6));



        Cardadapater reportsAdapter = new Cardadapater(this, reportList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(reportsAdapter);
    }
}
