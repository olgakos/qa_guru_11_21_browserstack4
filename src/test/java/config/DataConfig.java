package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:credentials.properties"})
public interface DataConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("identificateapp")
    String identificateapp();

    @Key("url")
    String url();


}
