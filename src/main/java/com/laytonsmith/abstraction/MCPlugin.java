/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.abstraction;

/**
 *
 * @author layton
 */
public interface MCPlugin extends AbstractionObject{
    public boolean isEnabled();
    public boolean isInstanceOf(Class c);
}
