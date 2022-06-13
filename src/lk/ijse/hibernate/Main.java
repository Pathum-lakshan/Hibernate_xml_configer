package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(
                "C002", "lakshan", 28000, "galle"
        );

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        //session.update(c1);

       // Customer customer = session.get(Customer.class, "C001");

        //session.delete(c1);

        Customer customer = session.get(Customer.class, "C002");

        session.delete(customer);

          // session.save(c1);

        transaction.commit();
        session.close();

    }
}
