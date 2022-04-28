package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:conf/browserstack.properties"})
public interface DataConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("app")
    String app();

    @Key("url")
    String url();
}
