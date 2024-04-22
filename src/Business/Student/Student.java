/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Student;

import Business.NetworkLocation.NetworkLocation;
import java.util.Random;

/**
 *
 * @author ketki
 */
public class Student {
    
    private String name;
    private int id;
    private int age;
    private double height;
    private double weight;
    private double BMI;
    private String gender;
    private static int count = 0;
    private NetworkLocation network;
    private String enterprise;
    private String goal;
    private String email;
    private String address;
    private String city;
    private String zipcode;
    private int min = 1000;
    private int max = 9999;
    private int roomNumber;

    public Student() {
        Random r = new Random();
        count = r.nextInt(max-min) + min;
        id = count;
        roomNumber = r.nextInt(max-min)+min;
    }

    public int getId() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    public NetworkLocation getNetwork() {
        return network;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
    
    public void setNetwork(NetworkLocation network) {
        this.network = network;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
