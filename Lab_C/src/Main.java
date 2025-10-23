import Parque_tematico.BilleteraParque;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elec1 = 1, elec2;
        int p1=150, p2=350, p3=600;
        BilleteraParque a = new BilleteraParque(100);
        
        while (elec1<5 && elec1>0) {
            System.out.println(
            "==Administrador de billeteras para parques temáticos==\n" + 
            "1. Agregar tickets\n" +
            "2. Establecer tickets\n" + 
            "3. Comprar premio\n" + 
            "4. Establecer festivo\n" + 
            "5. Salirr\n"+
            "Tu Billetera tiene: "+a.getTickets()+"\n"+
            "Ingrese la opción: ");
            elec1 = sc.nextInt();

            switch (elec1) {
                case 1:
                    System.out.println("\n¿Cuantos boletos se agregan?");
                    a.agregarTickets(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Establecer saldo de tickets en:");
                    a.setTickets(sc.nextInt());
                    break;

                case 3:
                if(a.getFestivo()==false){
                    System.out.println("1. Camiseta ("+p1+")\n" + 
                                        "2. Sombrero ("+p2+")\n" +
                                        "3. Tenis ("+p3+")\n" +
                                        "¿Qué premio desea comprar?");
                                        elec2 = sc.nextInt();
                                        
                                        switch (elec2) {
                                            case 1:
                                                if(a.removerTickets(p1)){System.out.println("Compré una camiseta por "+p1+" entradas.\n");}
                                                else{System.out.println("No hay suficientes boletos para comprar una camiseta.\n");}
                                                break;
                                            case 2:
                                                if(a.removerTickets(p2)){System.out.println("Compré un sombrero por "+p2+" entradas.\n");}
                                                else{System.out.println("No hay suficientes boletos para comprar un sombrero.\n");}
                                                break;
                                            case 3:
                                                if(a.removerTickets(p3)){System.out.println("Compré unos tenis por "+p3+" entradas.\n");}
                                                else{System.out.println("No hay suficientes boletos para comprar unos tenis.\n");}
                                                break;
                                            default:
                                                break;
                                            }
                }
                else{System.out.println("¡Precios de vacaciones!\n"+
                                        "1. Camiseta ("+p1/2+")\n" + 
                                        "2. Sombrero ("+p2/2+")\n" +
                                        "3. Tenis ("+p3/2+")\n" +
                                        "¿Qué premio desea comprar?");
                                        elec2 = sc.nextInt();
                                        
                                        switch (elec2) {
                                            case 1:
                                                if(a.removerTickets(p1/2)){System.out.println("Compré una camiseta por "+p1/2+" entradas.\n");}
                                                else{System.out.println("No hay suficientes boletos para comprar una camiseta.\n");}
                                                break;
                                            case 2:
                                                if(a.removerTickets(p2/2)){System.out.println("Compré un sombrero por "+p2/2+" entradas.\n");}
                                                else{System.out.println("No hay suficientes boletos para comprar un sombrero.\n");}
                                                break;
                                            case 3:
                                                if(a.removerTickets(p3/2)){System.out.println("Compré unos tenis por "+p3/2+" entradas.\n");}
                                                else{System.out.println("No hay suficientes boletos para comprar unos tenis.\n");}
                                                break;
                                            default:
                                                break;
                                            }
                    }
                break;
                case 4:
    if(a.getFestivo()) {
        a.setFestivo(false);
        System.out.println("Ahora es un día normal.");
    } else {
        a.setFestivo(true);
        System.out.println("Ahora es un día festivo.");
    }
    break;
       }
    }
}
}