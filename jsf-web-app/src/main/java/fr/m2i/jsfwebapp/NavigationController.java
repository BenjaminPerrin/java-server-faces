package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    public String moveToHello() {
        return "hello";
    }
}