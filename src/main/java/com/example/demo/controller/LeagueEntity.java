package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeagueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String itemname;
    private String damageitem;
    private String categoryitem;
    private String ablityitem;
    private String price;

    public LeagueEntity() {
    }
    
    
        public String getItemname() {
            return itemname;
        }
    
        public void setItemname(String itemname) {
            this.itemname = itemname;
        }
    
        public String getDamageitem() {
            return damageitem;
        }
    
        public void setDamageitem(String damageitem) {
            this.damageitem = damageitem;
        }
    
        public String getCategoryitem() {
            return categoryitem;
        }
    
        public void setCategoryitem(String categoryitem) {
            this.categoryitem = categoryitem;
        }
    
        public String getAblityitem() {
            return ablityitem;
        }
    
        public void setAblityitem(String ablityitem) {
            this.ablityitem = ablityitem;
        }
    
        
        public String getPrice() {
            return price;
        }
    
        public void setPrice(String price) {
            this.price = price;
        }

    
        public Integer getId() {
            return id;
        }
    
        public void setId(Integer id) {
            this.id = id;
        }
    
    

}
