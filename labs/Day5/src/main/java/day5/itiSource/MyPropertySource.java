package day5.itiSource;

import org.springframework.core.env.PropertySource;

public class MyPropertySource extends PropertySource {

    public MyPropertySource(String name) {
        super(name);
    }

    @Override
    public Object getProperty(String name) {
        Object result = null;

        if (name.equals("userId")) {
            result = "property source test";
        }
        return result;
    }
}
