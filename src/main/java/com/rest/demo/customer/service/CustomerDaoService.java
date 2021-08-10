package com.rest.demo.customer.service;

import com.rest.demo.customer.bean.CustomerBean;
import com.rest.demo.customer.exception.UserNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDaoService {

    public static int usersCount=5;
    private static List<CustomerBean> custs=new ArrayList<>();

    static
    {
        //adding users to the list
        custs.add(new CustomerBean(1, "Sesi"));
        custs.add(new CustomerBean(2, "Gopi"));
        custs.add(new CustomerBean(3, "Neeha"));
        custs.add(new CustomerBean(4, "Amu"));
        custs.add(new CustomerBean(5, "Indu"));
    }

    public List<CustomerBean> ListAllCustomers()
    {
        return  custs;
    }

    public CustomerBean GetCustomerByID(int id)
    {
        //custs.forEach(bean -> bean.getCustomerID());
        CustomerBean c= custs.stream().filter(bean -> bean.getCustomerID() == id).findAny().orElse(null);
        if (c == null)
            throw new UserNotFoundException("id not found " + id);
        return c;
    }

    public CustomerBean CreateCustomer(CustomerBean c)
    {
        custs.add(c);
        usersCount++;
        return c;
    }

    /*public static void main(String[] args)
    {
        CustomerDaoService ser = new CustomerDaoService();
        System.out.println(ser.GetCustomerByID(1).getCustomerName());

        ser.ListAllCustomers().forEach(x -> System.out.println(x.getCustomerName()));
    }*/

}
