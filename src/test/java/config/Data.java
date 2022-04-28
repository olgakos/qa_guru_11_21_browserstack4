package config;

import org.aeonbits.owner.ConfigFactory;

public class Data {

    public static DataConfig configStack = ConfigFactory.create(DataConfig.class, System.getProperties());

    public static String getUserName() {
        return configStack.username();
    }

    public static String getPassword() {
        return configStack.password();
    }

    public static String getApp() {
        return configStack.idapp();
    }

    public static String url() {
        return configStack.url();
    }
}

