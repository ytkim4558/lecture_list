package com.example.ytkim.listsampleforlecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Car> cars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cars = new ArrayList<>();
        cars.add(new Car("람보르기니", 4));
        cars.add(new Car("벤츠", 4));
        cars.add(new Car("소나타", 4));
        cars.add(new Car("지바이크", 2));
        CarListAdapter adapter = new CarListAdapter(this, cars);
        ListView carListView = (ListView) findViewById(R.id.car_list);
        carListView.setAdapter(adapter);



    }
}
