package entities;

import entities_enum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("ss:mm:HH dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    private Client client; //...atributo esse que valida a composição de objetos (entre o worker e o department)

    List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus orderStatus, Client client) { //não marcamos/"instâsnciamos" tipo lista no contrutor;
        this.moment = moment;
        this.status = orderStatus;
        this.client = client;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Order.sdf = sdf;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem (OrderItem item){
        items.add(item);
    }
    public void removeItem (OrderItem item){
        items.remove(item);
    }

    public double total() {
        double sumAux = 0;
        return //IMPLEMENTING
    }
}
