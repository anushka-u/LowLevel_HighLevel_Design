package SingletonPattern.withoutSingletonPattern;

public class WithoutSP {

    public static void main(String[] args) {
        AppSetting appSetting = new AppSetting();
        AppSetting appSettingsCopy = new AppSetting(); //Avoid creating copy, here only one object should exist.

        System.out.println(appSetting.getAppKey());
        System.out.println(appSettingsCopy.getAppKey());

        System.out.println(appSetting==appSettingsCopy);

    }
}
