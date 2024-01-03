package bharattech.loggerplugin.loggerlibrary;

import android.util.Log;

public class LoggerMessage {
    public static void errorMessage(String tag,String message){

        Log.e(tag,message);

    }

    public static void debugMessage(String tag,String message){

        Log.d(tag,message);

    }
}
