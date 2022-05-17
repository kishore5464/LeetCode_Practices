package com.kishore.leetcode;

public class Defanged_IPs {
    public static void main(String[] args) {
        defangedIps("120.90.80.114");
    }

    public static void defangedIps(String ip) {
        String defangedIp = ip.replace(".","[.]");
        System.out.println(defangedIp);
    }
}
