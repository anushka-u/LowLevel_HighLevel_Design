package SingletonPattern.withoutSingletonPattern;

public class AppSetting {

    private  String databaseUrl;

    private String appKey;

    public AppSetting(){
        //Read setting from a config
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        appKey = "12345_keyAbcd";
    }
    public String getDatabaseUrl(){
        return databaseUrl;
    }

    public String getAppKey(){
        return appKey;
    }

    public void setAppKey(String appKey){
        this.appKey = appKey;
    }
}
