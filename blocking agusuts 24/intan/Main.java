public class Main {
    public static void main (String []args){
        SepedaMotor Motor = new SepedaMotor();
        Motor.setMerk("suzuki");
        System.out.println("motor ini bermerk " +Motor.getMerk() );
        System.out.println("motor ini berharga " +Motor.Harga(11000000) );
    }
}