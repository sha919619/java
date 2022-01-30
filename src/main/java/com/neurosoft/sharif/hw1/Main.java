package com.neurosoft.sharif.hw1;

public class Main {
    public static void main(String[] args) {
        nonStatic ns = new nonStatic();
        ns.Sum();
        ns.Sub();
        ns.Div();
        ns.Mul();

        Static.Banana();
        Static.FreshBanana();
        Static.Mango();
        Static.WorkingHours();

        peramitarized p = new peramitarized();
        p.student(70, 50);
        p.exam(115, 5);
        p.snacks(230, 115);
        p.chairs(50, 4);
    }
}
