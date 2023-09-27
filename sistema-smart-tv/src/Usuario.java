public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        
        System.out.println(" Canal Atual:" + smartTv.canal);
        
        smartTv.mudarCanal(22);
        
        System.out.println(" Canal Atual:" + smartTv.canal);
       
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println(" Volume Atual:" + smartTv.volume);

        System.out.println(" TV ligada ?" + smartTv.ligada);
        System.out.println(" Canal Atual:" + smartTv.canal);
        System.out.println(" Volume Atual:" + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> TV " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> TV " + smartTv.ligada);


    }
}
