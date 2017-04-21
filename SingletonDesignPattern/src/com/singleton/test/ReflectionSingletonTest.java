package com.singleton.test;

import java.lang.reflect.Constructor;

import com.singleton.*;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        
        System.out.println(EagerInitializedSingleton.getInstance().hashCode());
        System.out.println(EagerInitializedSingleton.getInstance().hashCode());
        
        System.out.println(LazyInitializedSingleton.getInstance().hashCode());
        System.out.println(LazyInitializedSingleton.getInstance().hashCode());
                
        System.out.println(ThreadSafeSingleton.getInstance().hashCode());
        System.out.println(ThreadSafeSingleton.getInstance().hashCode());
                
        System.out.println(ThreadSafeSingleton.getInstanceUsingDoubleLocking().hashCode());
        System.out.println(ThreadSafeSingleton.getInstanceUsingDoubleLocking().hashCode());
        
        System.out.println(BillPughSingleton.getInstance().hashCode());
        System.out.println(BillPughSingleton.getInstance().hashCode());
        /*EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());*/
    }


    }


