public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv SmartTv = new SmartTv();

        System.out.println("TV Ligada : " + SmartTv.ligada);
        System.out.println("Canal : " + SmartTv.canal);
        System.out.println("Volume : " + SmartTv.volume);

        SmartTv.ligar();

        System.out.println("TV Ligada : " + SmartTv.ligada);
        System.out.println("Canal : " + SmartTv.canal);
        System.out.println("Volume : " + SmartTv.volume);

        SmartTv.desligar();

        System.out.println("TV Ligada : " + SmartTv.ligada);
        System.out.println("Canal : " + SmartTv.canal);
        System.out.println("Volume : " + SmartTv.volume);



    }
}
