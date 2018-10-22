package com.mpolder.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigurationLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger("Console");

    public static Logger getLogger() {
        return LOGGER;
    }
}
