package example.micronaut.strategy;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Requires;
import io.micronaut.jackson.JacksonConfiguration;

@Context
@Requires(bean = JacksonConfiguration.class, beanProperty = "moduleScan", value = "true")
public class AnotherBarStraregy implements BarStrategy {
    @Override
    public void doSmth() {
        System.out.println(AnotherBarStraregy.class);
    }
}
