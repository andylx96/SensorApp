package io.github.andylx96.sensorapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Pressure extends AppCompatActivity  implements SensorEventListener {


    TextView proxText;
    SensorManager sm;
    Sensor proxSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);


        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        proxSensor = sm.getDefaultSensor(Sensor.TYPE_PRESSURE);
        proxText = (TextView) findViewById(R.id.pressureView);

        if(proxSensor != null) {
            sm.registerListener(this, proxSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        else{
            Toast.makeText(this, "Sensor Not Found", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onSensorChanged(SensorEvent event) {


        proxText.setText("Pressure Sensor: " + String.valueOf(event.values[0]) + " hPa(milibar)");


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
