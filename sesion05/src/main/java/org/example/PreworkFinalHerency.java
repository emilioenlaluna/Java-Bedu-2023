package org.example;

public class PreworkFinalHerency
{
    final void M1(){
        System.out.println("M1");
    }
}

class PreworkPreworkFinalHerency2 extends PreworkFinalHerency{

    //ILEGAL
    /*
    final void M1(){
        System.out.println("M1");
    }

     */
}
