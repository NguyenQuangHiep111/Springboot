package vn.techmaster.demobean.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import vn.techmaster.demobean.interfaces.Engine;
import vn.techmaster.demobean.interfaces.Steering;

public class Car {
    private Engine engine;

    @Autowired
    @Qualifier("manualsteering")
    private Steering steering;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", steering=" + steering.steer() + "]";
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Steering getSteering() {
        return steering;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }
}
