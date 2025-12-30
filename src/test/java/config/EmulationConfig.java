package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:emulation.properties")
public interface EmulationConfig extends Config {

    @Key("device.name")
    String deviceName();

    @Key("app.package")
    String appPackage();

    @Key("platform.name")
    String platformName();
}
