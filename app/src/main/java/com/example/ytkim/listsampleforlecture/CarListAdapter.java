package com.example.ytkim.listsampleforlecture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarListAdapter extends BaseAdapter {
    private Context context;
    ArrayList<Car> carArrayList;

    CarListAdapter(Context context, ArrayList<Car> carArrayList) {
        this.context = context;
        this.carArrayList = carArrayList;
    }

    @Override
    public int getCount() {
        return carArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return carArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        TextView tv_carName;
        TextView tv_wheelCnt;

        public ViewHolder(View view) {
            tv_carName = (TextView)view.findViewById(R.id.carName);
            tv_wheelCnt = (TextView)view.findViewById(R.id.wheelCnt);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.car_list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Car currentCar = (Car) getItem(position);
        viewHolder.tv_carName.setText(currentCar.name);
        viewHolder.tv_wheelCnt.setText(String.valueOf(currentCar.weelCnt));

        return convertView;
    }
}
