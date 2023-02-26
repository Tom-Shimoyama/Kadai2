public class Main {


    //オリジナルクラス
    static class Car {
        private int fuel; //燃料
        private int consumption; //燃費

        //初期値
        Car(int fuel, int consumption){
            this.fuel = fuel;
            this.consumption = consumption;
        }

        //運転
        public void run (int mileage){
            this.fuel -= mileage / consumption;
        }

        //燃料計
        public void dispFuelGauge(){
            System.out.println("残量：" + this.fuel + "L");
        }

    }

    static class app{
        public static void main(String[] args) {

            Car car = new Car(40 , 9); //燃料は40L、燃費は9km/L

            car.run(60); //走行距離
            car.dispFuelGauge();
        }
    }


}
