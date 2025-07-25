package SingletonPattern.withSingletonPattern;

import java.util.Set;

public class AppSetting {

    private static AppSetting instance;
    private String databaseUrl;
    private String appKey;


    public static AppSetting getInstance(){
        if (instance == null) {
            instance = new AppSetting();
        }
        return instance;

    }
    private AppSetting(){
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        appKey = "12345_ABCDEkey";
    }

    public String getAppKey(){
        return appKey;
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
}
