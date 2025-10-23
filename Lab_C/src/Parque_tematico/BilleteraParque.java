package Parque_tematico;

public class BilleteraParque {
    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque() {
        tickets = 0;
    }

    public BilleteraParque(int tickets) {
        this.tickets = tickets;
    }

    public int getTickets() { 
        return tickets; 
    }
    
    public void setTickets(int tickets) {
        if (tickets >= 0) { 
            this.tickets = tickets; 
        } else { 
            this.tickets = 0;
        }
    }

    public static boolean getFestivo() { 
        return festivo; 
    }
    
    public static void setFestivo(boolean festivo) {
        BilleteraParque.festivo = festivo;
    }

    public void agregarTickets(int a) {
        if (a >= 0) {
            tickets += a;
        } else {
            System.out.println("Ingrese un numero positivo.\n");
        }
    }

    public boolean removerTickets(int b) {
        if (b > 0 && b <= tickets) {
            tickets -= b;
            return true;
        } else {
            return false;
        }
    }
}