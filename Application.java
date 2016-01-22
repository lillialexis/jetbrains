#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import android.app.Application;
import android.content.Context;

public class ${NAME} extends Application 
{
    private final static String TAG = "${PROJECT_NAME}:${NAME}";

    private static Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
    
    public static Context getContext() {
        return instance.getApplicationContext();
    }
}
