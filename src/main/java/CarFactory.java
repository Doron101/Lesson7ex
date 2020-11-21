public class CarFactory {

        public Drivable getCar(String carbrand) throws Exception {

          if(carbrand.equalsIgnoreCase("fiat")){
             return new Fiat();
          }

          if(carbrand.equalsIgnoreCase("BMW")){
             return new BMW();
          }

          if(carbrand.equalsIgnoreCase("Porsche")){
             return new Porsche();
          }

          throw new Exception(" <0 - 0> we are not making this car right now(try next week)");

        }
}