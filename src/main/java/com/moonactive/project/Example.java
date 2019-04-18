package com.moonactive.project;

import org.apache.spark.sql.SparkSession;

public class Example {

    public static void main(String[] args) {
        SparkSession spark = SparkSession
                .builder()
                .appName("test")
                .master("local[*]")
                .getOrCreate();

        System.out.println(spark.version());
    }
}
