package com.kai.chap;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 定义不同集合的属性（用于spring的集合注入）
 * @author hongok
 * @since 2018-9-28 16:29:24
 */
public class JavaCollection {

    List addressList;

    Set addressSet;

    Map addressMap;

    Properties addressProp;

    public List getAddressList() {
        System.out.println("List Elements :" + addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements :" + addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        System.out.println("Map Elements :" + addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProp() {
        System.out.println("Properties Elements :" + addressProp);
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }
}
