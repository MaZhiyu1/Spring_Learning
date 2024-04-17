package com.example.example13.imp;

import com.example.example13.inter.Tyre;

public class TyresImp {

    public class BridgeStone implements Tyre {
        @Override
        public void move() {
            System.out.println("moving with BridgeStone");
        }
    }

    public class Michelin implements Tyre{
        @Override
        public void move() {
            System.out.println("moving with Michelin");
        }
    }

    public BridgeStone chooseStone(){
        BridgeStone stone = new BridgeStone();
        return stone;
    }

    public Michelin chooseMichelin(){
        Michelin michelin = new Michelin();
        return michelin;
    }



}
