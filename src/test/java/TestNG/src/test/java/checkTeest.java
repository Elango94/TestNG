package TestNG.src.test.java;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkTeest {
    @Test(priority = 0)

    public void c() {

        System.out.println("c");

    }


    @Test(priority = 1)

    public void b() {

        System.out.println("b");

    }


    @Test

    public void a() {

        System.out.println("a");

    }


    @BeforeClass

    public void setup() {

        System.out.println("Setup");

    }


    @BeforeTest

    public void initialize() {

        System.out.println("Initialize");

    }


}
