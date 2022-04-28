package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/browserstack.properties"})
public interface DataConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("idapp")
    String idapp();

    @Key("url")
    String url();


}
