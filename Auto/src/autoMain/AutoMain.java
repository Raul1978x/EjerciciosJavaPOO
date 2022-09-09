package autoMain;

import Auto.Auto;
import ServiceAuto.ServiceAuto;

public class AutoMain {

    public static void main(String[] args) {
        ServiceAuto ServAuto = new ServiceAuto();
        Auto auto_1 = ServAuto.creaAuto();
        ServAuto.imprimeAuto(auto_1);
        ServAuto.cotizaService(auto_1);
//        Auto auto_2 = ServAuto.creaAuto();
//        ServAuto.cotizaService(auto_2);
//        Auto auto_3 = ServAuto.creaAuto();
//        ServAuto.cotizaService(auto_3);
//        Auto auto_4 = ServAuto.creaAuto();
//        ServAuto.cotizaService(auto_4);

    }

}
