package bharattech.loggerplugin.in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


//import bharattech.loggerplugin.loggerlibrary.LoggerMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // LoggerMessage.debugMessage("MainActivity","Hello");
    }
}