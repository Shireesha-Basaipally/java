package com.tnsif.Collections;
import java.util.LinkedHashSet;


public class LinkedHashset {

	public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate ignored

        System.out.println(set); // keeps insertion order
    }

		

	}


