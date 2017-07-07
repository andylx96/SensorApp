package io.github.andylx96.sensorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


//    TextView accelText;
//    SensorManager sm;
//    Sensor accelSensor;

    Button proxb, accelb, gyrob, pressureb, magnetb, stepb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        proxb = (Button) findViewById(R.id.proxSensor);
        proxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Main2Activity.this, ProximitySensor.class));
            }
        });

        accelb = (Button) findViewById(R.id.accelSensor);
        accelb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Main2Activity.this, Accelerometer.class));
            }
        });

        gyrob = (Button) findViewById(R.id.gyroSensor);
        gyrob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Main2Activity.this, Gyroscopic.class));
            }
        });

        pressureb = (Button) findViewById(R.id.pressureSensor);
        pressureb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Main2Activity.this, Pressure.class));
            }
        });



        magnetb = (Button) findViewById(R.id.magnetSensor);
        magnetb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Main2Activity.this, Magnetometer.class));
            }
        });


        stepb = (Button) findViewById(R.id.stepSensor);
        stepb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Main2Activity.this, StepCounter.class));
            }
        });



    }

}




//
//        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
//        accelSensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
//        accelText = (TextView) findViewById(R.id.accelSensor);
//        sm.registerListener(this,accelSensor, SensorManager.SENSOR_DELAY_NORMAL);
//
//    }
//
//
//

//
//    @Override
//    public void onSensorChanged(SensorEvent event) {
//
//
//        accelText.setText("Proximity Sensor: " + String.valueOf(event.values[0]));
//
//
//    }
//
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//
//    }
//}
