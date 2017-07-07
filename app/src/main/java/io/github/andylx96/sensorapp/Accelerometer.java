package io.github.andylx96.sensorapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Accelerometer extends AppCompatActivity  implements SensorEventListener {


    TextView accelText;
    SensorManager sm;
    Sensor accelSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);


        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        accelSensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        accelText = (TextView) findViewById(R.id.accelView);
        if(accelSensor != null) {
            sm.registerListener(this, accelSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        else{
            Toast.makeText(this, "Sensor Not Found", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onSensorChanged(SensorEvent event) {


        accelText.setText("Accelerometer Sensor: \n X: " + String.valueOf(event.values[0]) +
                "\n Y: " + String.valueOf(event.values[1]) +
                "\n Z: "+String.valueOf(event.values[2]) );


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
