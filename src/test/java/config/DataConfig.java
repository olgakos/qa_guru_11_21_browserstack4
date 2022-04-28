package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:conf/browserstack.properties"})
public interface DataConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("idiapp")
    String idiapp();

    @Key("url")
    String url();
}
