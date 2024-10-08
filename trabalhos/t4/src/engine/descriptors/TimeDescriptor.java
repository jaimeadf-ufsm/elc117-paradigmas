package engine.descriptors;

import java.util.Random;

public class TimeDescriptor extends TypeDescriptor {
    @Override
    public String getJavaTypeName() {
        return "java.sql.Time";
    }

    @Override
    public String getJdbcGetterMethodName() {
        return "getTime";
    }

    @Override
    public String getJdbcSetterMethodName() {
        return "setTime";
    }

    @Override
    public String getRandomValue() {
        return "new java.sql.Time(" + Math.abs(new Random().nextLong()) + "L)";
    }
}
