public class DependencyInjectionExample {

    static class Engine {
        public void start() {
            System.out.println("Engine Started Successfully");
        }
    }

    static class Car {

        private Engine engine;

        // Constructor Injection
        public Car(Engine engine) {
            this.engine = engine;
        }

        public void drive() {
            engine.start();
            System.out.println("Car is Running");
        }
    }

    public static void main(String[] args) {

        Engine engine = new Engine();

        // Injecting the dependency
        Car car = new Car(engine);

        car.drive();
    }
}
