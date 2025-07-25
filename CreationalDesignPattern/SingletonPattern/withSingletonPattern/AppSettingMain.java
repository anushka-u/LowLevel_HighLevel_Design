package SingletonPattern.withSingletonPattern;

public class AppSettingMain {
    public static void main(String[] args) {
        AppSetting appSetting = AppSetting.getInstance();
        AppSetting appSetting1 = AppSetting.getInstance();

        System.out.println(appSetting.getAppKey());
        System.out.println(appSetting1.getDatabaseUrl());
        System.out.println(appSetting1.getAppKey());
        System.out.println(appSetting.getDatabaseUrl());


        System.out.println(appSetting1==appSetting);

    }
}
