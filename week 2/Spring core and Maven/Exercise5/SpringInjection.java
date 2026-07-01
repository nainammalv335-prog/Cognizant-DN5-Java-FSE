public class SpringInjectionExample {

   
    static class Engine {
        public void start() {
            System.out.println("Engine Started");
        }
    }


    static class Car {

        private Engine engine;
        private String model;

       
        public Car(Engine engine) {
            this.engine = engine;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void display() {
            engine.start();
            System.out.println("Car Model : " + model);
        }
    }

    public static void main(String[] args) {

        Engine engine = new Engine();

        Car car = new Car(engine);

        car.setModel("Toyota");

        car.display();
    }
}
