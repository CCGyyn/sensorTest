package com.miki.ccg.senortest;

import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;


/**
 * @author ccg
 * @date 2019/6/5
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvSensors = (TextView) findViewById(R.id.tv_sensors);
        // 获取传感器sensorManager对象
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        tvSensors.append("有");
        tvSensors.append(String.valueOf(sensors.size()));
        tvSensors.append("个传感器\n");
        for (Sensor sensor:sensors
             ) {
            tvSensors.append(sensor.getName() + "\n");
        }
    }
}
