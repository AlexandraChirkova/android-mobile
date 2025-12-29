package config;

import org.aeonbits.owner.Config;

public interface EmulationConfig extends Config {

    @Key("device.name")
    String deviceName();
}
