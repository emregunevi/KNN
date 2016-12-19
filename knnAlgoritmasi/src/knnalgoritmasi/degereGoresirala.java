/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knnalgoritmasi;

import java.util.Comparator;

/**
 *
 * @author Günevi
 */
class degereGoresirala implements Comparator<uzaklik> {
    
    @Override
    public int compare(uzaklik o1, uzaklik o2) {
        return new Double(o1.getDeger()).compareTo(o2.getDeger());
    }
}