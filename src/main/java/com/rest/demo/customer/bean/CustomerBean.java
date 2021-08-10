package com.rest.demo.customer.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Customer Details")
public class CustomerBean {

    @ApiModelProperty(notes="customer id field")
    private int customerID;

    @ApiModelProperty(notes="name should have atleast 5 characters")
    private String customerName;

    @ApiModelProperty(required = false, dataType = "String", name = "pin", notes = "Pin Code", value = "1")
    private String customerPinCode;

    public CustomerBean()
    {

    }

    public CustomerBean(int cid, String cname)
    {
        setCustomerID(cid);
        setCustomerName(cname);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerPinCode() {
        return customerPinCode;
    }

    public void setCustomerPinCode(String customerPinCode) {
        this.customerPinCode = customerPinCode;
    }



}
