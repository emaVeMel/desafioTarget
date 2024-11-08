package application;

import entities.Distributor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Distributor> list = new ArrayList<>();
        double totalAmount = 0.0;

        list.add(new Distributor("SP", 67836.43));
        list.add(new Distributor("Rj", 36678.66));
        list.add(new Distributor("MG", 29229.88));
        list.add(new Distributor("ES", 27165.48));
        list.add(new Distributor("Others", 19894.53));


        for (Distributor d : list) {
            totalAmount += d.getInvoicing();
        }

        for (Distributor d : list) {
            System.out.println(d.getOperationState() + "'s revenue percentage is " + 100 * d.getInvoicing() / totalAmount + "%.");
        }

    }
}