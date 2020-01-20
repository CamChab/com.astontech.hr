package com.astontech.hr.controllers;

import javax.persistence.Entity;

//@Entity
public class ElementVO {

    private String newElementType;
    private String newElements;

    public ElementVO() {}

    public String getNewElements() {
        return newElements;
    }

    public void setNewElements(String newElements) {
        this.newElements = newElements;
    }

    public String getNewElementType() {
        return newElementType;
    }

    public void setNewElementType(String newElementType) {
        this.newElementType = newElementType;
    }
}
