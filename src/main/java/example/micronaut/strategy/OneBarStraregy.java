package example.micronaut.strategy;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Requires;
import io.micronaut.jackson.JacksonConfiguration;

@Context
@Requires(bean = JacksonConfiguration.class, beanProperty = "moduleScan", notEquals = "true")
public class OneBarStraregy implements BarStrategy {
    @Override
    public void doSmth() {
        System.out.println(OneBarStraregy.class);
    }
}
