/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.levan;

import edu.blackburn.cs.cs212sp16.er.*;

/**
 *
 * @author arthur.levan
 */
public class TriageStack extends AbstractStack {



    @Override
    public void push(Patient ptnt) {
        this.top = new ListElement(ptnt);
        top.setNext(this.top);
        increment();
    }

    @Override
    public Patient pop() {
      
        if(this.top.getPatient() != null){
            return this.top.getPatient();
            decrement();
        }
        return null;
    }

}
