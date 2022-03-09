package com.bmcotuk;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CocktailAppApplication extends Application<CocktailAppConfiguration> {

    public static void main(final String[] args) throws Exception {
        new CocktailAppApplication().run(args);
    }

    @Override
    public String getName() {
        return "CocktailApp";
    }

    @Override
    public void initialize(final Bootstrap<CocktailAppConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final CocktailAppConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
