package example.micronaut;

import example.micronaut.config.BarProperties;
import example.micronaut.strategy.BarStrategy;
import io.micronaut.context.annotation.Context;
import jakarta.inject.Inject;

@Context
public class FooService {
    @Inject
    private BarStrategy barStrategy;
}
